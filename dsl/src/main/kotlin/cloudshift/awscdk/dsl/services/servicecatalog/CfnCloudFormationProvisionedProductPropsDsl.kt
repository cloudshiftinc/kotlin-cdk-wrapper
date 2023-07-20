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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCloudFormationProvisionedProductPropsDsl {
    private val cdkBuilder: CfnCloudFormationProvisionedProductProps.Builder =
        CfnCloudFormationProvisionedProductProps.builder()

    private val _notificationArns: MutableList<String> = mutableListOf()

    private val _provisioningParameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    public fun pathId(pathId: String) {
        cdkBuilder.pathId(pathId)
    }

    public fun pathName(pathName: String) {
        cdkBuilder.pathName(pathName)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun productName(productName: String) {
        cdkBuilder.productName(productName)
    }

    public fun provisionedProductName(provisionedProductName: String) {
        cdkBuilder.provisionedProductName(provisionedProductName)
    }

    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    public fun provisioningArtifactName(provisioningArtifactName: String) {
        cdkBuilder.provisioningArtifactName(provisioningArtifactName)
    }

    public fun provisioningParameters(vararg provisioningParameters: Any) {
        _provisioningParameters.addAll(listOf(*provisioningParameters))
    }

    public fun provisioningParameters(provisioningParameters: Collection<Any>) {
        _provisioningParameters.addAll(provisioningParameters)
    }

    public fun provisioningParameters(provisioningParameters: IResolvable) {
        cdkBuilder.provisioningParameters(provisioningParameters)
    }

    public fun provisioningPreferences(provisioningPreferences: IResolvable) {
        cdkBuilder.provisioningPreferences(provisioningPreferences)
    }

    public fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty) {
        cdkBuilder.provisioningPreferences(provisioningPreferences)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCloudFormationProvisionedProductProps {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        if (_provisioningParameters.isNotEmpty()) {
            cdkBuilder.provisioningParameters(_provisioningParameters)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
