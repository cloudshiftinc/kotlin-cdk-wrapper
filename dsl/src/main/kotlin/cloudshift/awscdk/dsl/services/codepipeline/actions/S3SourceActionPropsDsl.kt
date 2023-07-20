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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class S3SourceActionPropsDsl {
    private val cdkBuilder: S3SourceActionProps.Builder = S3SourceActionProps.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketKey(bucketKey: String) {
        cdkBuilder.bucketKey(bucketKey)
    }

    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun trigger(trigger: S3Trigger) {
        cdkBuilder.trigger(trigger)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): S3SourceActionProps = cdkBuilder.build()
}
