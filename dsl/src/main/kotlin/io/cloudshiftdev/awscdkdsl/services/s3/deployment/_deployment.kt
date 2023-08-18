@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3.deployment

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext
import software.amazon.awscdk.services.s3.deployment.SourceConfig
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata
import software.constructs.Construct

public object deployment {
    /**
     * `BucketDeployment` populates an S3 bucket with the contents of .zip files from other S3
     * buckets or from local disk.
     *
     * Example:
     * ```
     * Bucket websiteBucket;
     * BucketDeployment deployment = BucketDeployment.Builder.create(this, "DeployWebsite")
     * .sources(List.of(Source.asset(join(__dirname, "my-website"))))
     * .destinationBucket(websiteBucket)
     * .build();
     * new ConstructThatReadsFromTheBucket(this, "Consumer", Map.of(
     * // Use 'deployment.deployedBucket' instead of 'websiteBucket' here
     * "bucket", deployment.getDeployedBucket()));
     * ```
     */
    public inline fun bucketDeployment(
        scope: Construct,
        id: String,
        block: BucketDeploymentDsl.() -> Unit = {},
    ): BucketDeployment {
        val builder = BucketDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `BucketDeployment`.
     *
     * Example:
     * ```
     * Bucket websiteBucket;
     * BucketDeployment deployment = BucketDeployment.Builder.create(this, "DeployWebsite")
     * .sources(List.of(Source.asset(join(__dirname, "my-website"))))
     * .destinationBucket(websiteBucket)
     * .build();
     * new ConstructThatReadsFromTheBucket(this, "Consumer", Map.of(
     * // Use 'deployment.deployedBucket' instead of 'websiteBucket' here
     * "bucket", deployment.getDeployedBucket()));
     * ```
     */
    public inline fun bucketDeploymentProps(
        block: BucketDeploymentPropsDsl.() -> Unit = {}
    ): BucketDeploymentProps {
        val builder = BucketDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `DeployTimeSubstitutedFile` is an extension of `BucketDeployment` that allows users to upload
     * individual files and specify to make substitutions in the file.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function myLambdaFunction;
     * Bucket destinationBucket;
     * DeployTimeSubstitutedFile.Builder.create(this, "MyFile")
     * .source("my-file.yaml")
     * .destinationBucket(destinationBucket)
     * .substitutions(Map.of(
     * "variableName", myLambdaFunction.getFunctionName()))
     * .build();
     * ```
     */
    public inline fun deployTimeSubstitutedFile(
        scope: Construct,
        id: String,
        block: DeployTimeSubstitutedFileDsl.() -> Unit = {},
    ): DeployTimeSubstitutedFile {
        val builder = DeployTimeSubstitutedFileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function myLambdaFunction;
     * Bucket destinationBucket;
     * DeployTimeSubstitutedFile.Builder.create(this, "MyFile")
     * .source("my-file.yaml")
     * .destinationBucket(destinationBucket)
     * .substitutions(Map.of(
     * "variableName", myLambdaFunction.getFunctionName()))
     * .build();
     * ```
     */
    public inline fun deployTimeSubstitutedFileProps(
        block: DeployTimeSubstitutedFilePropsDsl.() -> Unit = {}
    ): DeployTimeSubstitutedFileProps {
        val builder = DeployTimeSubstitutedFilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Bind context for ISources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.s3.deployment.*;
     * Role role;
     * DeploymentSourceContext deploymentSourceContext = DeploymentSourceContext.builder()
     * .handlerRole(role)
     * .build();
     * ```
     */
    public inline fun deploymentSourceContext(
        block: DeploymentSourceContextDsl.() -> Unit = {}
    ): DeploymentSourceContext {
        val builder = DeploymentSourceContextDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Source information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.s3.deployment.*;
     * Bucket bucket;
     * Object markers;
     * SourceConfig sourceConfig = SourceConfig.builder()
     * .bucket(bucket)
     * .zipObjectKey("zipObjectKey")
     * // the properties below are optional
     * .markers(Map.of(
     * "markersKey", markers))
     * .build();
     * ```
     */
    public inline fun sourceConfig(block: SourceConfigDsl.() -> Unit = {}): SourceConfig {
        val builder = SourceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Custom user defined metadata.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.deployment.*;
     * UserDefinedObjectMetadata userDefinedObjectMetadata =
     * UserDefinedObjectMetadata.builder().build();
     * ```
     *
     * @deprecated Use raw property bags instead (object literals, `Map&lt;String,Object&gt;`,
     *   etc... )
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun userDefinedObjectMetadata(
        block: UserDefinedObjectMetadataDsl.() -> Unit = {}
    ): UserDefinedObjectMetadata {
        val builder = UserDefinedObjectMetadataDsl()
        builder.apply(block)
        return builder.build()
    }
}
