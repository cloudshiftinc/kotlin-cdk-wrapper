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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCanaryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCanary.Builder = CfnCanary.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun artifactConfig(artifactConfig: IResolvable) {
        cdkBuilder.artifactConfig(artifactConfig)
    }

    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty) {
        cdkBuilder.artifactConfig(artifactConfig)
    }

    public fun artifactS3Location(artifactS3Location: String) {
        cdkBuilder.artifactS3Location(artifactS3Location)
    }

    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    public fun code(code: CfnCanary.CodeProperty) {
        cdkBuilder.code(code)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
        cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
        cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun failureRetentionPeriod(failureRetentionPeriod: Number) {
        cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runConfig(runConfig: IResolvable) {
        cdkBuilder.runConfig(runConfig)
    }

    public fun runConfig(runConfig: CfnCanary.RunConfigProperty) {
        cdkBuilder.runConfig(runConfig)
    }

    public fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnCanary.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
        cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
        cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    public fun successRetentionPeriod(successRetentionPeriod: Number) {
        cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun visualReference(visualReference: IResolvable) {
        cdkBuilder.visualReference(visualReference)
    }

    public fun visualReference(visualReference: CfnCanary.VisualReferenceProperty) {
        cdkBuilder.visualReference(visualReference)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnCanary {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
