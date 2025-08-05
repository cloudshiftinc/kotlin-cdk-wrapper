@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Cache options for CodeBuild Project.
 *
 * A cache can store reusable pieces of your build environment and use them across multiple builds.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * SecurityGroup mySecurityGroup;
 * CodeBuildStep.Builder.create("Synth")
 * // ...standard ShellStep props...
 * .commands(List.of())
 * .env(Map.of())
 * // If you are using a CodeBuildStep explicitly, set the 'cdk.out' directory
 * // to be the synth step's output.
 * .primaryOutputDirectory("cdk.out")
 * // Control the name of the project
 * .projectName("MyProject")
 * // Control parts of the BuildSpec other than the regular 'build' and 'install' commands
 * .partialBuildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * // Control the build environment
 * .buildEnvironment(BuildEnvironment.builder()
 * .computeType(ComputeType.LARGE)
 * .privileged(true)
 * .build())
 * .timeout(Duration.minutes(90))
 * .fileSystemLocations(List.of(FileSystemLocation.efs(EfsFileSystemLocationProps.builder()
 * .identifier("myidentifier2")
 * .location("myclodation.mydnsroot.com:/loc")
 * .mountPoint("/media")
 * .mountOptions("opts")
 * .build())))
 * // Control Elastic Network Interface creation
 * .vpc(vpc)
 * .subnetSelection(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_WITH_EGRESS).build())
 * .securityGroups(List.of(mySecurityGroup))
 * // Control caching
 * .cache(Cache.bucket(new Bucket(this, "Cache")))
 * // Additional policy statements for the execution role
 * .rolePolicyStatements(List.of(
 * PolicyStatement.Builder.create().build()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-caching.html)
 */
public abstract class Cache(
  cdkObject: software.amazon.awscdk.services.codebuild.Cache,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.Cache,
  ) : Cache(cdkObject)

  public companion object {
    public fun bucket(bucket: IBucket): Cache =
        software.amazon.awscdk.services.codebuild.Cache.bucket(bucket.let(IBucket.Companion::unwrap)).let(Cache::wrap)

    public fun bucket(bucket: IBucket, options: BucketCacheOptions): Cache =
        software.amazon.awscdk.services.codebuild.Cache.bucket(bucket.let(IBucket.Companion::unwrap),
        options.let(BucketCacheOptions.Companion::unwrap)).let(Cache::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6eb3d0edf88b31d8b205a25aad1fee39fac0902b3ecfcfda69f004457e7f5f4")
    public fun bucket(bucket: IBucket, options: BucketCacheOptions.Builder.() -> Unit): Cache =
        bucket(bucket, BucketCacheOptions(options))

    public fun local(modes: LocalCacheMode): Cache =
        software.amazon.awscdk.services.codebuild.Cache.local(modes.let(LocalCacheMode.Companion::unwrap)).let(Cache::wrap)

    public fun none(): Cache =
        software.amazon.awscdk.services.codebuild.Cache.none().let(Cache::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Cache): Cache =
        CdkObjectWrappers.wrap(cdkObject) as? Cache ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Cache): software.amazon.awscdk.services.codebuild.Cache = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.Cache
  }
}
