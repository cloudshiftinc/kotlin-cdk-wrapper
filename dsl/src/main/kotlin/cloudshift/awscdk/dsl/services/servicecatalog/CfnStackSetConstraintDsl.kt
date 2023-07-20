@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStackSetConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStackSetConstraint.Builder =
        CfnStackSetConstraint.Builder.create(scope, id)

    private val _accountList: MutableList<String> = mutableListOf()

    private val _regionList: MutableList<String> = mutableListOf()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun accountList(vararg accountList: String) {
        _accountList.addAll(listOf(*accountList))
    }

    public fun accountList(accountList: Collection<String>) {
        _accountList.addAll(accountList)
    }

    public fun adminRole(adminRole: String) {
        cdkBuilder.adminRole(adminRole)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun regionList(vararg regionList: String) {
        _regionList.addAll(listOf(*regionList))
    }

    public fun regionList(regionList: Collection<String>) {
        _regionList.addAll(regionList)
    }

    public fun stackInstanceControl(stackInstanceControl: String) {
        cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): CfnStackSetConstraint {
        if (_accountList.isNotEmpty()) cdkBuilder.accountList(_accountList)
        if (_regionList.isNotEmpty()) cdkBuilder.regionList(_regionList)
        return cdkBuilder.build()
    }
}
