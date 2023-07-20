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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeviceFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeviceFleet.Builder = CfnDeviceFleet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun deviceFleetName(deviceFleetName: String) {
        cdkBuilder.deviceFleetName(deviceFleetName)
    }

    public fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig)
    }

    public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceFleet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
