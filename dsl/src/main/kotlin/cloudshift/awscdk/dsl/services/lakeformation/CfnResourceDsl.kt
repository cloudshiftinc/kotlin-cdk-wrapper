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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    public fun withFederation(withFederation: Boolean) {
        cdkBuilder.withFederation(withFederation)
    }

    public fun withFederation(withFederation: IResolvable) {
        cdkBuilder.withFederation(withFederation)
    }

    public fun build(): CfnResource = cdkBuilder.build()
}
