@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Where to publish docker images.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * DockerImageDestination dockerImageDestination = DockerImageDestination.builder()
 * .imageTag("imageTag")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
public interface DockerImageDestination : AwsDestination {
  /**
   * Tag of the image to publish.
   */
  public fun imageTag(): String

  /**
   * Name of the ECR repository to publish to.
   */
  public fun repositoryName(): String

  /**
   * A builder for [DockerImageDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param imageTag Tag of the image to publish. 
     */
    public fun imageTag(imageTag: String)

    /**
     * @param region The region where this asset will need to be published.
     */
    public fun region(region: String)

    /**
     * @param repositoryName Name of the ECR repository to publish to. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination.Builder =
        software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination.builder()

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the role.
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param imageTag Tag of the image to publish. 
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * @param region The region where this asset will need to be published.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param repositoryName Name of the ECR repository to publish to. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination,
  ) : CdkObject(cdkObject),
      DockerImageDestination {
    /**
     * Additional options to pass to STS when assuming the role.
     *
     * * `RoleArn` should not be used. Use the dedicated `assumeRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `assumeRoleExternalId` instead.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    /**
     * The role that needs to be assumed while publishing this asset.
     *
     * Default: - No role will be assumed
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * Tag of the image to publish.
     */
    override fun imageTag(): String = unwrap(this).getImageTag()

    /**
     * The region where this asset will need to be published.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Name of the ECR repository to publish to.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination):
        DockerImageDestination = CdkObjectWrappers.wrap(cdkObject) as? DockerImageDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageDestination):
        software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination
  }
}
