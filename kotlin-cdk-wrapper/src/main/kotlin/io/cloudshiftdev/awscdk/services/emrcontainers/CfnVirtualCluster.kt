@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emrcontainers

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EMRContainers::VirtualCluster` resource specifies a virtual cluster.
 *
 * A virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list, and
 * delete virtual clusters. They do not consume any additional resources in your system. A single
 * virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
 * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emrcontainers.*;
 * CfnVirtualCluster cfnVirtualCluster = CfnVirtualCluster.Builder.create(this,
 * "MyCfnVirtualCluster")
 * .containerProvider(ContainerProviderProperty.builder()
 * .id("id")
 * .info(ContainerInfoProperty.builder()
 * .eksInfo(EksInfoProperty.builder()
 * .namespace("namespace")
 * .build())
 * .build())
 * .type("type")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html)
 */
public open class CfnVirtualCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the project, such as
   * `arn:aws:emr-containers:us-east-1:123456789012:/virtualclusters/ab4rp1abcs8xz47n3x0example` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the virtual cluster, such as `ab4rp1abcs8xz47n3x0example` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The container provider of the virtual cluster.
   */
  public open fun containerProvider(): Any = unwrap(this).getContainerProvider()

  /**
   * The container provider of the virtual cluster.
   */
  public open fun containerProvider(`value`: IResolvable) {
    unwrap(this).setContainerProvider(`value`.let(IResolvable::unwrap))
  }

  /**
   * The container provider of the virtual cluster.
   */
  public open fun containerProvider(`value`: ContainerProviderProperty) {
    unwrap(this).setContainerProvider(`value`.let(ContainerProviderProperty::unwrap))
  }

  /**
   * The container provider of the virtual cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7de37ba8106c92bf70a36ab4cb8cd2fff708708ebe76bfc00e75d3cfb7d83e3")
  public open fun containerProvider(`value`: ContainerProviderProperty.Builder.() -> Unit): Unit =
      containerProvider(ContainerProviderProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the virtual cluster.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the virtual cluster.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emrcontainers.CfnVirtualCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    public fun containerProvider(containerProvider: IResolvable)

    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    public fun containerProvider(containerProvider: ContainerProviderProperty)

    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e89df576ee0d06994e7056ae49e61090d8197040e42065ef0f40f4e78a3d4cd")
    public fun containerProvider(containerProvider: ContainerProviderProperty.Builder.() -> Unit)

    /**
     * The name of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-name)
     * @param name The name of the virtual cluster. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder
        = software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.Builder.create(scope, id)

    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    override fun containerProvider(containerProvider: IResolvable) {
      cdkBuilder.containerProvider(containerProvider.let(IResolvable::unwrap))
    }

    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    override fun containerProvider(containerProvider: ContainerProviderProperty) {
      cdkBuilder.containerProvider(containerProvider.let(ContainerProviderProperty::unwrap))
    }

    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     * @param containerProvider The container provider of the virtual cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e89df576ee0d06994e7056ae49e61090d8197040e42065ef0f40f4e78a3d4cd")
    override fun containerProvider(containerProvider: ContainerProviderProperty.Builder.() -> Unit):
        Unit = containerProvider(ContainerProviderProperty(containerProvider))

    /**
     * The name of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-name)
     * @param name The name of the virtual cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster):
        CfnVirtualCluster = CfnVirtualCluster(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualCluster):
        software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster = wrapped.cdkObject
  }

  /**
   * The information about the Amazon EKS cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emrcontainers.*;
   * EksInfoProperty eksInfoProperty = EksInfoProperty.builder()
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-eksinfo.html)
   */
  public interface EksInfoProperty {
    /**
     * The namespaces of the EKS cluster.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 63
     *
     * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-eksinfo.html#cfn-emrcontainers-virtualcluster-eksinfo-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [EksInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespace The namespaces of the EKS cluster. 
       * *Minimum* : 1
       *
       * *Maximum* : 63
       *
       * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty.Builder =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty.builder()

      /**
       * @param namespace The namespaces of the EKS cluster. 
       * *Minimum* : 1
       *
       * *Maximum* : 63
       *
       * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty,
    ) : CdkObject(cdkObject), EksInfoProperty {
      /**
       * The namespaces of the EKS cluster.
       *
       * *Minimum* : 1
       *
       * *Maximum* : 63
       *
       * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-eksinfo.html#cfn-emrcontainers-virtualcluster-eksinfo-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty):
          EksInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? EksInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksInfoProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty
    }
  }

  /**
   * The information about the container provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emrcontainers.*;
   * ContainerProviderProperty containerProviderProperty = ContainerProviderProperty.builder()
   * .id("id")
   * .info(ContainerInfoProperty.builder()
   * .eksInfo(EksInfoProperty.builder()
   * .namespace("namespace")
   * .build())
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html)
   */
  public interface ContainerProviderProperty {
    /**
     * The ID of the container cluster.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 100
     *
     * *Pattern* : `^[0-9A-Za-z][A-Za-z0-9\-_]*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-id)
     */
    public fun id(): String

    /**
     * The information about the container cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-info)
     */
    public fun info(): Any

    /**
     * The type of the container provider.
     *
     * Amazon EKS is the only supported type as of now.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-type)
     */
    public fun type(): String

    /**
     * A builder for [ContainerProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the container cluster. 
       * *Minimum* : 1
       *
       * *Maximum* : 100
       *
       * *Pattern* : `^[0-9A-Za-z][A-Za-z0-9\-_]*`
       */
      public fun id(id: String)

      /**
       * @param info The information about the container cluster. 
       */
      public fun info(info: IResolvable)

      /**
       * @param info The information about the container cluster. 
       */
      public fun info(info: ContainerInfoProperty)

      /**
       * @param info The information about the container cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa976c868c8531fc2f2117b620b1cb75fb826367a1a24556c5720ed57e4fceb")
      public fun info(info: ContainerInfoProperty.Builder.() -> Unit)

      /**
       * @param type The type of the container provider. 
       * Amazon EKS is the only supported type as of now.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.Builder
          =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.builder()

      /**
       * @param id The ID of the container cluster. 
       * *Minimum* : 1
       *
       * *Maximum* : 100
       *
       * *Pattern* : `^[0-9A-Za-z][A-Za-z0-9\-_]*`
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param info The information about the container cluster. 
       */
      override fun info(info: IResolvable) {
        cdkBuilder.info(info.let(IResolvable::unwrap))
      }

      /**
       * @param info The information about the container cluster. 
       */
      override fun info(info: ContainerInfoProperty) {
        cdkBuilder.info(info.let(ContainerInfoProperty::unwrap))
      }

      /**
       * @param info The information about the container cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa976c868c8531fc2f2117b620b1cb75fb826367a1a24556c5720ed57e4fceb")
      override fun info(info: ContainerInfoProperty.Builder.() -> Unit): Unit =
          info(ContainerInfoProperty(info))

      /**
       * @param type The type of the container provider. 
       * Amazon EKS is the only supported type as of now.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty,
    ) : CdkObject(cdkObject), ContainerProviderProperty {
      /**
       * The ID of the container cluster.
       *
       * *Minimum* : 1
       *
       * *Maximum* : 100
       *
       * *Pattern* : `^[0-9A-Za-z][A-Za-z0-9\-_]*`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The information about the container cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-info)
       */
      override fun info(): Any = unwrap(this).getInfo()

      /**
       * The type of the container provider.
       *
       * Amazon EKS is the only supported type as of now.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html#cfn-emrcontainers-virtualcluster-containerprovider-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty):
          ContainerProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProviderProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty
    }
  }

  /**
   * The information about the container used for a job run or a managed endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emrcontainers.*;
   * ContainerInfoProperty containerInfoProperty = ContainerInfoProperty.builder()
   * .eksInfo(EksInfoProperty.builder()
   * .namespace("namespace")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerinfo.html)
   */
  public interface ContainerInfoProperty {
    /**
     * The information about the Amazon EKS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerinfo.html#cfn-emrcontainers-virtualcluster-containerinfo-eksinfo)
     */
    public fun eksInfo(): Any

    /**
     * A builder for [ContainerInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      public fun eksInfo(eksInfo: IResolvable)

      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      public fun eksInfo(eksInfo: EksInfoProperty)

      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6ff6de1923c0ff91cb430fdd5391a7aa62c04bdbe1f675b3d5693174d18029c")
      public fun eksInfo(eksInfo: EksInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.Builder
          =
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.builder()

      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      override fun eksInfo(eksInfo: IResolvable) {
        cdkBuilder.eksInfo(eksInfo.let(IResolvable::unwrap))
      }

      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      override fun eksInfo(eksInfo: EksInfoProperty) {
        cdkBuilder.eksInfo(eksInfo.let(EksInfoProperty::unwrap))
      }

      /**
       * @param eksInfo The information about the Amazon EKS cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6ff6de1923c0ff91cb430fdd5391a7aa62c04bdbe1f675b3d5693174d18029c")
      override fun eksInfo(eksInfo: EksInfoProperty.Builder.() -> Unit): Unit =
          eksInfo(EksInfoProperty(eksInfo))

      public fun build():
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty,
    ) : CdkObject(cdkObject), ContainerInfoProperty {
      /**
       * The information about the Amazon EKS cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerinfo.html#cfn-emrcontainers-virtualcluster-containerinfo-eksinfo)
       */
      override fun eksInfo(): Any = unwrap(this).getEksInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty):
          ContainerInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ContainerInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerInfoProperty):
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty
    }
  }
}
