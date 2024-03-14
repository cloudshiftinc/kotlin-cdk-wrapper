package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFargateProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the cluster, such as
   * `arn:aws:eks:us-west-2:666666666666:fargateprofile/myCluster/myFargateProfile/1cb1a11a-1dc1-1d11-cf11-1111f11fa111`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The name of the Fargate profile.
   */
  public open fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  /**
   * The name of the Fargate profile.
   */
  public open fun fargateProfileName(`value`: String) {
    unwrap(this).setFargateProfileName(`value`)
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
   * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches the
   * selectors in the Fargate profile.
   */
  public open fun podExecutionRoleArn(): String = unwrap(this).getPodExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches the
   * selectors in the Fargate profile.
   */
  public open fun podExecutionRoleArn(`value`: String) {
    unwrap(this).setPodExecutionRoleArn(`value`)
  }

  /**
   * The selectors to match for a `Pod` to use this Fargate profile.
   */
  public open fun selectors(): Any = unwrap(this).getSelectors()

  /**
   * The selectors to match for a `Pod` to use this Fargate profile.
   */
  public open fun selectors(`value`: IResolvable) {
    unwrap(this).setSelectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * The selectors to match for a `Pod` to use this Fargate profile.
   */
  public open fun selectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setSelectors(__idx_ac66f0)
  }

  /**
   * The selectors to match for a `Pod` to use this Fargate profile.
   */
  public open fun selectors(vararg __idx_ac66f0: Any): Unit = selectors(__idx_ac66f0.toList())

  /**
   * The IDs of subnets to launch a `Pod` into.
   */
  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * The IDs of subnets to launch a `Pod` into.
   */
  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  /**
   * The IDs of subnets to launch a `Pod` into.
   */
  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnFargateProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-clustername)
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The name of the Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-fargateprofilename)
     * @param fargateProfileName The name of the Fargate profile. 
     */
    public fun fargateProfileName(fargateProfileName: String)

    /**
     * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches
     * the selectors in the Fargate profile.
     *
     * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a
     * node, and it provides read access to Amazon ECR image repositories. For more information, see
     * [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-podexecutionrolearn)
     * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the `Pod` execution role to use
     * for a `Pod` that matches the selectors in the Fargate profile. 
     */
    public fun podExecutionRoleArn(podExecutionRoleArn: String)

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    public fun selectors(selectors: IResolvable)

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    public fun selectors(selectors: List<Any>)

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    public fun selectors(vararg selectors: Any)

    /**
     * The IDs of subnets to launch a `Pod` into.
     *
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
     * @param subnets The IDs of subnets to launch a `Pod` into. 
     */
    public fun subnets(subnets: List<String>)

    /**
     * The IDs of subnets to launch a `Pod` into.
     *
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
     * @param subnets The IDs of subnets to launch a `Pod` into. 
     */
    public fun subnets(vararg subnets: String)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnFargateProfile.Builder =
        software.amazon.awscdk.services.eks.CfnFargateProfile.Builder.create(scope, id)

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-clustername)
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The name of the Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-fargateprofilename)
     * @param fargateProfileName The name of the Fargate profile. 
     */
    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches
     * the selectors in the Fargate profile.
     *
     * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a
     * node, and it provides read access to Amazon ECR image repositories. For more information, see
     * [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-podexecutionrolearn)
     * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the `Pod` execution role to use
     * for a `Pod` that matches the selectors in the Fargate profile. 
     */
    override fun podExecutionRoleArn(podExecutionRoleArn: String) {
      cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
    }

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    override fun selectors(selectors: IResolvable) {
      cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
    }

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    override fun selectors(selectors: List<Any>) {
      cdkBuilder.selectors(selectors)
    }

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     */
    override fun selectors(vararg selectors: Any): Unit = selectors(selectors.toList())

    /**
     * The IDs of subnets to launch a `Pod` into.
     *
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
     * @param subnets The IDs of subnets to launch a `Pod` into. 
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * The IDs of subnets to launch a `Pod` into.
     *
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
     * @param subnets The IDs of subnets to launch a `Pod` into. 
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFargateProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFargateProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile):
        CfnFargateProfile = CfnFargateProfile(cdkObject)

    internal fun unwrap(wrapped: CfnFargateProfile):
        software.amazon.awscdk.services.eks.CfnFargateProfile = wrapped.cdkObject
  }

  public interface LabelProperty {
    /**
     * Enter a key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html#cfn-eks-fargateprofile-label-key)
     */
    public fun key(): String

    /**
     * Enter a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html#cfn-eks-fargateprofile-label-value)
     */
    public fun `value`(): String

    /**
     * A builder for [LabelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Enter a key. 
       */
      public fun key(key: String)

      /**
       * @param value Enter a value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.Builder =
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.builder()

      /**
       * @param key Enter a key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value Enter a value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty,
    ) : LabelProperty {
      /**
       * Enter a key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html#cfn-eks-fargateprofile-label-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Enter a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html#cfn-eks-fargateprofile-label-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SelectorProperty {
    /**
     * The Kubernetes labels that the selector should match.
     *
     * A pod must contain all of the labels that are specified in the selector for it to be
     * considered a match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-selector.html#cfn-eks-fargateprofile-selector-labels)
     */
    public fun labels(): Any? = unwrap(this).getLabels()

    /**
     * The Kubernetes `namespace` that the selector should match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-selector.html#cfn-eks-fargateprofile-selector-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [SelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      public fun labels(labels: IResolvable)

      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      public fun labels(labels: List<Any>)

      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      public fun labels(vararg labels: Any)

      /**
       * @param namespace The Kubernetes `namespace` that the selector should match. 
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty.Builder =
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty.builder()

      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      override fun labels(labels: List<Any>) {
        cdkBuilder.labels(labels)
      }

      /**
       * @param labels The Kubernetes labels that the selector should match.
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       */
      override fun labels(vararg labels: Any): Unit = labels(labels.toList())

      /**
       * @param namespace The Kubernetes `namespace` that the selector should match. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty,
    ) : SelectorProperty {
      /**
       * The Kubernetes labels that the selector should match.
       *
       * A pod must contain all of the labels that are specified in the selector for it to be
       * considered a match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-selector.html#cfn-eks-fargateprofile-selector-labels)
       */
      override fun labels(): Any? = unwrap(this).getLabels()

      /**
       * The Kubernetes `namespace` that the selector should match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-selector.html#cfn-eks-fargateprofile-selector-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty):
          SelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelectorProperty):
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
