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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.StackAsset
import software.amazon.awscdk.pipelines.StackDeploymentProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class StackDeploymentPropsDsl {
    private val cdkBuilder: StackDeploymentProps.Builder = StackDeploymentProps.builder()

    private val _assets: MutableList<StackAsset> = mutableListOf()

    public fun absoluteTemplatePath(absoluteTemplatePath: String) {
        cdkBuilder.absoluteTemplatePath(absoluteTemplatePath)
    }

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun assets(assets: StackAssetDsl.() -> Unit) {
        _assets.add(StackAssetDsl().apply(assets).build())
    }

    public fun assets(assets: Collection<StackAsset>) {
        _assets.addAll(assets)
    }

    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    public fun constructPath(constructPath: String) {
        cdkBuilder.constructPath(constructPath)
    }

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun stackArtifactId(stackArtifactId: String) {
        cdkBuilder.stackArtifactId(stackArtifactId)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): StackDeploymentProps {
        if (_assets.isNotEmpty()) cdkBuilder.assets(_assets)
        return cdkBuilder.build()
    }
}
