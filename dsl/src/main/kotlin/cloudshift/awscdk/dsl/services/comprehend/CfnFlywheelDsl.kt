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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlywheelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlywheel.Builder = CfnFlywheel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun activeModelArn(activeModelArn: String) {
        cdkBuilder.activeModelArn(activeModelArn)
    }

    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
        cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    public fun dataLakeS3Uri(dataLakeS3Uri: String) {
        cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    public fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    public fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    public fun flywheelName(flywheelName: String) {
        cdkBuilder.flywheelName(flywheelName)
    }

    public fun modelType(modelType: String) {
        cdkBuilder.modelType(modelType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun taskConfig(taskConfig: IResolvable) {
        cdkBuilder.taskConfig(taskConfig)
    }

    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty) {
        cdkBuilder.taskConfig(taskConfig)
    }

    public fun build(): CfnFlywheel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
