package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ARN of the compute fleet.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds
   * that can run in parallel.
   */
  public open fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  /**
   * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds
   * that can run in parallel.
   */
  public open fun baseCapacity(`value`: Number) {
    unwrap(this).setBaseCapacity(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Information about the compute resources the compute fleet uses.
   *
   * Available values include:.
   */
  public open fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * Information about the compute resources the compute fleet uses.
   *
   * Available values include:.
   */
  public open fun computeType(`value`: String) {
    unwrap(this).setComputeType(`value`)
  }

  /**
   * The environment type of the compute fleet.
   */
  public open fun environmentType(): String? = unwrap(this).getEnvironmentType()

  /**
   * The environment type of the compute fleet.
   */
  public open fun environmentType(`value`: String) {
    unwrap(this).setEnvironmentType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the compute fleet.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the compute fleet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of
     * builds that can run in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel. 
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * Information about the compute resources the compute fleet uses. Available values include:.
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     * builds. This compute type supports Docker images up to 100 GB uncompressed.
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 3 GB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GB memory, 4 vCPUs, and 1
     * NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 15 GB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GB memory, 32 vCPUs, and
     * 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:. 
     */
    public fun computeType(computeType: String)

    /**
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
     * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Asia Pacific (Mumbai) and EU (Ireland).
     * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     * (Sydney), Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia
     * Pacific (Mumbai).
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-environmenttype)
     * @param environmentType The environment type of the compute fleet. 
     */
    public fun environmentType(environmentType: String)

    /**
     * The name of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
     * @param name The name of the compute fleet. 
     */
    public fun name(name: String)

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnFleet.Builder =
        software.amazon.awscdk.services.codebuild.CfnFleet.Builder.create(scope, id)

    /**
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of
     * builds that can run in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel. 
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * Information about the compute resources the compute fleet uses. Available values include:.
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     * builds. This compute type supports Docker images up to 100 GB uncompressed.
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 3 GB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GB memory, 4 vCPUs, and 1
     * NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 15 GB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GB memory, 32 vCPUs, and
     * 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:. 
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
     * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Asia Pacific (Mumbai) and EU (Ireland).
     * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     * (Sydney), Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia
     * Pacific (Mumbai).
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-environmenttype)
     * @param environmentType The environment type of the compute fleet. 
     */
    override fun environmentType(environmentType: String) {
      cdkBuilder.environmentType(environmentType)
    }

    /**
     * The name of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
     * @param name The name of the compute fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codebuild.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.codebuild.CfnFleet =
        wrapped.cdkObject
  }
}
