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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVerifiedAccessTrustProviderPropsDsl {
    private val cdkBuilder: CfnVerifiedAccessTrustProviderProps.Builder =
        CfnVerifiedAccessTrustProviderProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun deviceOptions(deviceOptions: IResolvable) {
        cdkBuilder.deviceOptions(deviceOptions)
    }

    public fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty) {
        cdkBuilder.deviceOptions(deviceOptions)
    }

    public fun deviceTrustProviderType(deviceTrustProviderType: String) {
        cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    public fun oidcOptions(oidcOptions: IResolvable) {
        cdkBuilder.oidcOptions(oidcOptions)
    }

    public fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty) {
        cdkBuilder.oidcOptions(oidcOptions)
    }

    public fun policyReferenceName(policyReferenceName: String) {
        cdkBuilder.policyReferenceName(policyReferenceName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun trustProviderType(trustProviderType: String) {
        cdkBuilder.trustProviderType(trustProviderType)
    }

    public fun userTrustProviderType(userTrustProviderType: String) {
        cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): CfnVerifiedAccessTrustProviderProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
