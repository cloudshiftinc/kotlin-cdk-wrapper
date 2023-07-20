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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolUserPropsDsl {
    private val cdkBuilder: CfnUserPoolUserProps.Builder = CfnUserPoolUserProps.builder()

    private val _desiredDeliveryMediums: MutableList<String> = mutableListOf()

    private val _userAttributes: MutableList<Any> = mutableListOf()

    private val _validationData: MutableList<Any> = mutableListOf()

    public fun clientMetadata(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.clientMetadata(builder.map)
    }

    public fun clientMetadata(clientMetadata: Any) {
        cdkBuilder.clientMetadata(clientMetadata)
    }

    public fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String) {
        _desiredDeliveryMediums.addAll(listOf(*desiredDeliveryMediums))
    }

    public fun desiredDeliveryMediums(desiredDeliveryMediums: Collection<String>) {
        _desiredDeliveryMediums.addAll(desiredDeliveryMediums)
    }

    public fun forceAliasCreation(forceAliasCreation: Boolean) {
        cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    public fun forceAliasCreation(forceAliasCreation: IResolvable) {
        cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    public fun messageAction(messageAction: String) {
        cdkBuilder.messageAction(messageAction)
    }

    public fun userAttributes(vararg userAttributes: Any) {
        _userAttributes.addAll(listOf(*userAttributes))
    }

    public fun userAttributes(userAttributes: Collection<Any>) {
        _userAttributes.addAll(userAttributes)
    }

    public fun userAttributes(userAttributes: IResolvable) {
        cdkBuilder.userAttributes(userAttributes)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun validationData(vararg validationData: Any) {
        _validationData.addAll(listOf(*validationData))
    }

    public fun validationData(validationData: Collection<Any>) {
        _validationData.addAll(validationData)
    }

    public fun validationData(validationData: IResolvable) {
        cdkBuilder.validationData(validationData)
    }

    public fun build(): CfnUserPoolUserProps {
        if (_desiredDeliveryMediums.isNotEmpty()) {
            cdkBuilder.desiredDeliveryMediums(_desiredDeliveryMediums)
        }
        if (_userAttributes.isNotEmpty()) cdkBuilder.userAttributes(_userAttributes)
        if (_validationData.isNotEmpty()) cdkBuilder.validationData(_validationData)
        return cdkBuilder.build()
    }
}
