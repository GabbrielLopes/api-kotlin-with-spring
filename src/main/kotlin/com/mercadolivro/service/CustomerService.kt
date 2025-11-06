package com.mercadolivro.service

import com.mercadolivro.dto.PostCustomerRequest
import com.mercadolivro.dto.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service

@Service
class CustomerService {

    private val customers = mutableListOf<CustomerModel>()

    fun getAllCustomers(name: String?): List<CustomerModel> {
        return name?.let {
            customers.filter { it.name.contains(name, ignoreCase = true) }
        } ?: customers
    }

    fun getCustomerById(id: String): CustomerModel {
        return customers.first { it.id == id }
    }

    fun createCustomer(customer: CustomerModel) {
        val lastId = (customers.size + 1).toString()
        customer.id = lastId

        customers.add(customer)
    }

    fun updateCustomer(customer: CustomerModel) {
        customers.first { it.id == customer.id }.let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun deleteCustomer(id: String) {
        customers.removeIf { it.id == id }
    }
}