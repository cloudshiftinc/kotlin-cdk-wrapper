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
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolIdentityProviderPropsDsl {
    private val cdkBuilder: CfnUserPoolIdentityProviderProps.Builder =
        CfnUserPoolIdentityProviderProps.builder()

    private val _idpIdentifiers: MutableList<String> = mutableListOf()

    public fun attributeMapping(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.attributeMapping(builder.map)
    }

    public fun attributeMapping(attributeMapping: Any) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    public fun idpIdentifiers(vararg idpIdentifiers: String) {
        _idpIdentifiers.addAll(listOf(*idpIdentifiers))
    }

    public fun idpIdentifiers(idpIdentifiers: Collection<String>) {
        _idpIdentifiers.addAll(idpIdentifiers)
    }

    public fun providerDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.providerDetails(builder.map)
    }

    public fun providerDetails(providerDetails: Any) {
        cdkBuilder.providerDetails(providerDetails)
    }

    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    public fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolIdentityProviderProps {
        if (_idpIdentifiers.isNotEmpty()) cdkBuilder.idpIdentifiers(_idpIdentifiers)
        return cdkBuilder.build()
    }
}
