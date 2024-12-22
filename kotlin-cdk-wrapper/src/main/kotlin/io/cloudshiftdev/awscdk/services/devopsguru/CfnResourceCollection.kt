@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * A collection of AWS resources supported by DevOps Guru.
 *
 * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can
 * be configured to analyze only the AWS resources that are defined in the stacks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devopsguru.*;
 * CfnResourceCollection cfnResourceCollection = CfnResourceCollection.Builder.create(this,
 * "MyCfnResourceCollection")
 * .resourceCollectionFilter(ResourceCollectionFilterProperty.builder()
 * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
 * .stackNames(List.of("stackNames"))
 * .build())
 * .tags(List.of(TagCollectionProperty.builder()
 * .appBoundaryKey("appBoundaryKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html)
 */
public open class CfnResourceCollection(
  cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceCollectionProps,
  ) :
      this(software.amazon.awscdk.services.devopsguru.CfnResourceCollection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceCollectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceCollectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceCollectionProps(props)
  )

  /**
   * The type of AWS resource collections to return.
   *
   * The one valid value is `CLOUD_FORMATION` for AWS CloudFormation stacks.
   */
  public open fun attrResourceCollectionType(): String =
      unwrap(this).getAttrResourceCollectionType()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   */
  public open fun resourceCollectionFilter(): Any = unwrap(this).getResourceCollectionFilter()

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   */
  public open fun resourceCollectionFilter(`value`: IResolvable) {
    unwrap(this).setResourceCollectionFilter(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   */
  public open fun resourceCollectionFilter(`value`: ResourceCollectionFilterProperty) {
    unwrap(this).setResourceCollectionFilter(`value`.let(ResourceCollectionFilterProperty.Companion::unwrap))
  }

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6942d67cda36cba7675611fd73a2b21d0820a7aca0124d79e912360440e0f283")
  public open
      fun resourceCollectionFilter(`value`: ResourceCollectionFilterProperty.Builder.() -> Unit):
      Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devopsguru.CfnResourceCollection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable)

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    public fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty)

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    public
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder
        = software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder.create(scope, id)

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    override fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(ResourceCollectionFilterProperty.Companion::unwrap))
    }

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit):
        Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(resourceCollectionFilter))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnResourceCollection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection):
        CfnResourceCollection = CfnResourceCollection(cdkObject)

    internal fun unwrap(wrapped: CfnResourceCollection):
        software.amazon.awscdk.services.devopsguru.CfnResourceCollection = wrapped.cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnResourceCollection
  }

  /**
   * Information about AWS CloudFormation stacks.
   *
   * You can use up to 1000 stacks to specify which AWS resources in your account to analyze. For
   * more information, see
   * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the *AWS
   * CloudFormation User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * CloudFormationCollectionFilterProperty cloudFormationCollectionFilterProperty =
   * CloudFormationCollectionFilterProperty.builder()
   * .stackNames(List.of("stackNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-cloudformationcollectionfilter.html)
   */
  public interface CloudFormationCollectionFilterProperty {
    /**
     * An array of CloudFormation stack names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-cloudformationcollectionfilter.html#cfn-devopsguru-resourcecollection-cloudformationcollectionfilter-stacknames)
     */
    public fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()

    /**
     * A builder for [CloudFormationCollectionFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stackNames An array of CloudFormation stack names.
       */
      public fun stackNames(stackNames: List<String>)

      /**
       * @param stackNames An array of CloudFormation stack names.
       */
      public fun stackNames(vararg stackNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.builder()

      /**
       * @param stackNames An array of CloudFormation stack names.
       */
      override fun stackNames(stackNames: List<String>) {
        cdkBuilder.stackNames(stackNames)
      }

      /**
       * @param stackNames An array of CloudFormation stack names.
       */
      override fun stackNames(vararg stackNames: String): Unit = stackNames(stackNames.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty,
    ) : CdkObject(cdkObject),
        CloudFormationCollectionFilterProperty {
      /**
       * An array of CloudFormation stack names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-cloudformationcollectionfilter.html#cfn-devopsguru-resourcecollection-cloudformationcollectionfilter-stacknames)
       */
      override fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudFormationCollectionFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty):
          CloudFormationCollectionFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudFormationCollectionFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudFormationCollectionFilterProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
    }
  }

  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * ResourceCollectionFilterProperty resourceCollectionFilterProperty =
   * ResourceCollectionFilterProperty.builder()
   * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
   * .stackNames(List.of("stackNames"))
   * .build())
   * .tags(List.of(TagCollectionProperty.builder()
   * .appBoundaryKey("appBoundaryKey")
   * .tagValues(List.of("tagValues"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html)
   */
  public interface ResourceCollectionFilterProperty {
    /**
     * Information about AWS CloudFormation stacks.
     *
     * You can use up to 1000 stacks to specify which AWS resources in your account to analyze. For
     * more information, see
     * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the *AWS
     * CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter-cloudformation)
     */
    public fun cloudFormation(): Any? = unwrap(this).getCloudFormation()

    /**
     * The AWS tags used to filter the resources in the resource collection.
     *
     * Tags help you identify and organize your AWS resources. Many AWS services support tagging, so
     * you can assign the same tag to resources from different services to indicate that the resources
     * are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     * you assign to an AWS Lambda function. For more information about using tags, see the [Tagging
     * best
     * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
     * whitepaper.
     *
     * Each AWS tag has two parts.
     *
     * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * *keys* are case-sensitive.
     * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
     * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
     * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
     * specified.
     *
     * Together these are known as *key* - *value* pairs.
     *
     *
     * The string used for a *key* in a tag that you use to define your resource coverage must begin
     * with the prefix `Devops-guru-` . The tag *key* might be `DevOps-Guru-deployment-application` or
     * `devops-guru-rds-application` . When you create a *key* , the case of characters in the *key*
     * can be whatever you choose. After you create a *key* , it is case-sensitive. For example, DevOps
     * Guru works with a *key* named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these
     * act as two different *keys* . Possible *key* / *value* pairs in your application might be
     * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter-tags)
     */
    public fun tags(): List<TagCollectionProperty> =
        unwrap(this).getTags()?.map(TagCollectionProperty::wrap) ?: emptyList()

    /**
     * A builder for [ResourceCollectionFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      public fun cloudFormation(cloudFormation: IResolvable)

      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      public fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty)

      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      public
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit)

      /**
       * @param tags The AWS tags used to filter the resources in the resource collection.
       * Tags help you identify and organize your AWS resources. Many AWS services support tagging,
       * so you can assign the same tag to resources from different services to indicate that the
       * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
       * resource that you assign to an AWS Lambda function. For more information about using tags, see
       * the [Tagging best
       * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
       * whitepaper.
       *
       * Each AWS tag has two parts.
       *
       * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
       * *keys* are case-sensitive.
       * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
       * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
       * specified.
       *
       * Together these are known as *key* - *value* pairs.
       *
       *
       * The string used for a *key* in a tag that you use to define your resource coverage must
       * begin with the prefix `Devops-guru-` . The tag *key* might be
       * `DevOps-Guru-deployment-application` or `devops-guru-rds-application` . When you create a
       * *key* , the case of characters in the *key* can be whatever you choose. After you create a
       * *key* , it is case-sensitive. For example, DevOps Guru works with a *key* named
       * `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different *keys*
       * . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      public fun tags(tags: List<TagCollectionProperty>)

      /**
       * @param tags The AWS tags used to filter the resources in the resource collection.
       * Tags help you identify and organize your AWS resources. Many AWS services support tagging,
       * so you can assign the same tag to resources from different services to indicate that the
       * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
       * resource that you assign to an AWS Lambda function. For more information about using tags, see
       * the [Tagging best
       * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
       * whitepaper.
       *
       * Each AWS tag has two parts.
       *
       * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
       * *keys* are case-sensitive.
       * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
       * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
       * specified.
       *
       * Together these are known as *key* - *value* pairs.
       *
       *
       * The string used for a *key* in a tag that you use to define your resource coverage must
       * begin with the prefix `Devops-guru-` . The tag *key* might be
       * `DevOps-Guru-deployment-application` or `devops-guru-rds-application` . When you create a
       * *key* , the case of characters in the *key* can be whatever you choose. After you create a
       * *key* , it is case-sensitive. For example, DevOps Guru works with a *key* named
       * `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different *keys*
       * . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      public fun tags(vararg tags: TagCollectionProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.builder()

      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      override fun cloudFormation(cloudFormation: IResolvable) {
        cdkBuilder.cloudFormation(cloudFormation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      override fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty) {
        cdkBuilder.cloudFormation(cloudFormation.let(CloudFormationCollectionFilterProperty.Companion::unwrap))
      }

      /**
       * @param cloudFormation Information about AWS CloudFormation stacks.
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      override
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit):
          Unit = cloudFormation(CloudFormationCollectionFilterProperty(cloudFormation))

      /**
       * @param tags The AWS tags used to filter the resources in the resource collection.
       * Tags help you identify and organize your AWS resources. Many AWS services support tagging,
       * so you can assign the same tag to resources from different services to indicate that the
       * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
       * resource that you assign to an AWS Lambda function. For more information about using tags, see
       * the [Tagging best
       * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
       * whitepaper.
       *
       * Each AWS tag has two parts.
       *
       * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
       * *keys* are case-sensitive.
       * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
       * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
       * specified.
       *
       * Together these are known as *key* - *value* pairs.
       *
       *
       * The string used for a *key* in a tag that you use to define your resource coverage must
       * begin with the prefix `Devops-guru-` . The tag *key* might be
       * `DevOps-Guru-deployment-application` or `devops-guru-rds-application` . When you create a
       * *key* , the case of characters in the *key* can be whatever you choose. After you create a
       * *key* , it is case-sensitive. For example, DevOps Guru works with a *key* named
       * `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different *keys*
       * . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      override fun tags(tags: List<TagCollectionProperty>) {
        cdkBuilder.tags(tags.map(TagCollectionProperty.Companion::unwrap))
      }

      /**
       * @param tags The AWS tags used to filter the resources in the resource collection.
       * Tags help you identify and organize your AWS resources. Many AWS services support tagging,
       * so you can assign the same tag to resources from different services to indicate that the
       * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
       * resource that you assign to an AWS Lambda function. For more information about using tags, see
       * the [Tagging best
       * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
       * whitepaper.
       *
       * Each AWS tag has two parts.
       *
       * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
       * *keys* are case-sensitive.
       * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
       * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
       * specified.
       *
       * Together these are known as *key* - *value* pairs.
       *
       *
       * The string used for a *key* in a tag that you use to define your resource coverage must
       * begin with the prefix `Devops-guru-` . The tag *key* might be
       * `DevOps-Guru-deployment-application` or `devops-guru-rds-application` . When you create a
       * *key* , the case of characters in the *key* can be whatever you choose. After you create a
       * *key* , it is case-sensitive. For example, DevOps Guru works with a *key* named
       * `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different *keys*
       * . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      override fun tags(vararg tags: TagCollectionProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty,
    ) : CdkObject(cdkObject),
        ResourceCollectionFilterProperty {
      /**
       * Information about AWS CloudFormation stacks.
       *
       * You can use up to 1000 stacks to specify which AWS resources in your account to analyze.
       * For more information, see
       * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
       * *AWS CloudFormation User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter-cloudformation)
       */
      override fun cloudFormation(): Any? = unwrap(this).getCloudFormation()

      /**
       * The AWS tags used to filter the resources in the resource collection.
       *
       * Tags help you identify and organize your AWS resources. Many AWS services support tagging,
       * so you can assign the same tag to resources from different services to indicate that the
       * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
       * resource that you assign to an AWS Lambda function. For more information about using tags, see
       * the [Tagging best
       * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
       * whitepaper.
       *
       * Each AWS tag has two parts.
       *
       * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
       * *keys* are case-sensitive.
       * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
       * name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. The tag value is a required property when AppBoundaryKey is
       * specified.
       *
       * Together these are known as *key* - *value* pairs.
       *
       *
       * The string used for a *key* in a tag that you use to define your resource coverage must
       * begin with the prefix `Devops-guru-` . The tag *key* might be
       * `DevOps-Guru-deployment-application` or `devops-guru-rds-application` . When you create a
       * *key* , the case of characters in the *key* can be whatever you choose. After you create a
       * *key* , it is case-sensitive. For example, DevOps Guru works with a *key* named
       * `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different *keys*
       * . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter-tags)
       */
      override fun tags(): List<TagCollectionProperty> =
          unwrap(this).getTags()?.map(TagCollectionProperty::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceCollectionFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty):
          ResourceCollectionFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceCollectionFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCollectionFilterProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
    }
  }

  /**
   * A collection of AWS tags.
   *
   * Tags help you identify and organize your AWS resources. Many AWS services support tagging, so
   * you can assign the same tag to resources from different services to indicate that the resources
   * are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
   * you assign to an AWS Lambda function. For more information about using tags, see the [Tagging best
   * practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
   * whitepaper.
   *
   * Each AWS tag has two parts.
   *
   * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
   * *keys* are case-sensitive.
   * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team name).
   * Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag *values* are
   * case-sensitive. The tag value is a required property when *AppBoundaryKey* is specified.
   *
   * Together these are known as *key* - *value* pairs.
   *
   *
   * The string used for a *key* in a tag that you use to define your resource coverage must begin
   * with the prefix `Devops-guru-` . The tag *key* might be `DevOps-Guru-deployment-application` or
   * `devops-guru-rds-application` . When you create a *key* , the case of characters in the *key* can
   * be whatever you choose. After you create a *key* , it is case-sensitive. For example, DevOps Guru
   * works with a *key* named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as
   * two different *keys* . Possible *key* / *value* pairs in your application might be
   * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * TagCollectionProperty tagCollectionProperty = TagCollectionProperty.builder()
   * .appBoundaryKey("appBoundaryKey")
   * .tagValues(List.of("tagValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html)
   */
  public interface TagCollectionProperty {
    /**
     * An AWS tag *key* that is used to identify the AWS resources that DevOps Guru analyzes.
     *
     * All AWS resources in your account and Region tagged with this *key* make up your DevOps Guru
     * application and analysis boundary.
     *
     *
     * When you create a *key* , the case of characters in the *key* can be whatever you choose.
     * After you create a *key* , it is case-sensitive. For example, DevOps Guru works with a *key*
     * named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different
     * *keys* . Possible *key* / *value* pairs in your application might be
     * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html#cfn-devopsguru-resourcecollection-tagcollection-appboundarykey)
     */
    public fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

    /**
     * The values in an AWS tag collection.
     *
     * The tag's *value* is a field used to associate a string with the tag *key* (for example,
     * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key* pair.
     * Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag *values*
     * are case-sensitive. You can specify a maximum of 256 characters for a tag value. The tag value
     * is a required property when *AppBoundaryKey* is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html#cfn-devopsguru-resourcecollection-tagcollection-tagvalues)
     */
    public fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()

    /**
     * A builder for [TagCollectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appBoundaryKey An AWS tag *key* that is used to identify the AWS resources that
       * DevOps Guru analyzes.
       * All AWS resources in your account and Region tagged with this *key* make up your DevOps
       * Guru application and analysis boundary.
       *
       *
       * When you create a *key* , the case of characters in the *key* can be whatever you choose.
       * After you create a *key* , it is case-sensitive. For example, DevOps Guru works with a *key*
       * named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different
       * *keys* . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      public fun appBoundaryKey(appBoundaryKey: String)

      /**
       * @param tagValues The values in an AWS tag collection.
       * The tag's *value* is a field used to associate a string with the tag *key* (for example,
       * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key*
       * pair. Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. You can specify a maximum of 256 characters for a tag value. The
       * tag value is a required property when *AppBoundaryKey* is specified.
       */
      public fun tagValues(tagValues: List<String>)

      /**
       * @param tagValues The values in an AWS tag collection.
       * The tag's *value* is a field used to associate a string with the tag *key* (for example,
       * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key*
       * pair. Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. You can specify a maximum of 256 characters for a tag value. The
       * tag value is a required property when *AppBoundaryKey* is specified.
       */
      public fun tagValues(vararg tagValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.builder()

      /**
       * @param appBoundaryKey An AWS tag *key* that is used to identify the AWS resources that
       * DevOps Guru analyzes.
       * All AWS resources in your account and Region tagged with this *key* make up your DevOps
       * Guru application and analysis boundary.
       *
       *
       * When you create a *key* , the case of characters in the *key* can be whatever you choose.
       * After you create a *key* , it is case-sensitive. For example, DevOps Guru works with a *key*
       * named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different
       * *keys* . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       */
      override fun appBoundaryKey(appBoundaryKey: String) {
        cdkBuilder.appBoundaryKey(appBoundaryKey)
      }

      /**
       * @param tagValues The values in an AWS tag collection.
       * The tag's *value* is a field used to associate a string with the tag *key* (for example,
       * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key*
       * pair. Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. You can specify a maximum of 256 characters for a tag value. The
       * tag value is a required property when *AppBoundaryKey* is specified.
       */
      override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      /**
       * @param tagValues The values in an AWS tag collection.
       * The tag's *value* is a field used to associate a string with the tag *key* (for example,
       * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key*
       * pair. Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. You can specify a maximum of 256 characters for a tag value. The
       * tag value is a required property when *AppBoundaryKey* is specified.
       */
      override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty,
    ) : CdkObject(cdkObject),
        TagCollectionProperty {
      /**
       * An AWS tag *key* that is used to identify the AWS resources that DevOps Guru analyzes.
       *
       * All AWS resources in your account and Region tagged with this *key* make up your DevOps
       * Guru application and analysis boundary.
       *
       *
       * When you create a *key* , the case of characters in the *key* can be whatever you choose.
       * After you create a *key* , it is case-sensitive. For example, DevOps Guru works with a *key*
       * named `devops-guru-rds` and a *key* named `DevOps-Guru-RDS` , and these act as two different
       * *keys* . Possible *key* / *value* pairs in your application might be
       * `Devops-Guru-production-application/RDS` or `Devops-Guru-production-application/containers` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html#cfn-devopsguru-resourcecollection-tagcollection-appboundarykey)
       */
      override fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

      /**
       * The values in an AWS tag collection.
       *
       * The tag's *value* is a field used to associate a string with the tag *key* (for example,
       * `111122223333` , `Production` , or a team name). The *key* and *value* are the tag's *key*
       * pair. Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
       * *values* are case-sensitive. You can specify a maximum of 256 characters for a tag value. The
       * tag value is a required property when *AppBoundaryKey* is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html#cfn-devopsguru-resourcecollection-tagcollection-tagvalues)
       */
      override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagCollectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty):
          TagCollectionProperty = CdkObjectWrappers.wrap(cdkObject) as? TagCollectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagCollectionProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty
    }
  }
}
