@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

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
 * Creates a resource set in Amazon Route 53 Application Recovery Controller.
 *
 * A resource set is a set of resources of one type, such as Network Load Balancers, that span
 * multiple cells. You can associate a resource set with a readiness check to have Route 53 ARC
 * continually monitor the resources in the set for failover readiness.
 *
 * You typically create a resource set and a readiness check for each supported type of AWS resource
 * in your application.
 *
 * For more information, see [Readiness checks, resource sets, and readiness
 * scopes](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.recovery-groups.readiness-scope.html)
 * in the Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
 * CfnResourceSet cfnResourceSet = CfnResourceSet.Builder.create(this, "MyCfnResourceSet")
 * .resources(List.of(ResourceProperty.builder()
 * .componentId("componentId")
 * .dnsTargetResource(DNSTargetResourceProperty.builder()
 * .domainName("domainName")
 * .hostedZoneArn("hostedZoneArn")
 * .recordSetId("recordSetId")
 * .recordType("recordType")
 * .targetResource(TargetResourceProperty.builder()
 * .nlbResource(NLBResourceProperty.builder()
 * .arn("arn")
 * .build())
 * .r53Resource(R53ResourceRecordProperty.builder()
 * .domainName("domainName")
 * .recordSetId("recordSetId")
 * .build())
 * .build())
 * .build())
 * .readinessScopes(List.of("readinessScopes"))
 * .resourceArn("resourceArn")
 * .build()))
 * .resourceSetType("resourceSetType")
 * // the properties below are optional
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html)
 */
public open class CfnResourceSet(
  cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceSetProps,
  ) :
      this(software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceSetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resource set.
   */
  public open fun attrResourceSetArn(): String = unwrap(this).getAttrResourceSetArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the resource set to create.
   */
  public open fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  /**
   * The name of the resource set to create.
   */
  public open fun resourceSetName(`value`: String) {
    unwrap(this).setResourceSetName(`value`)
  }

  /**
   * The resource type of the resources in the resource set.
   *
   * Enter one of the following values for resource type:.
   */
  public open fun resourceSetType(): String = unwrap(this).getResourceSetType()

  /**
   * The resource type of the resources in the resource set.
   *
   * Enter one of the following values for resource type:.
   */
  public open fun resourceSetType(`value`: String) {
    unwrap(this).setResourceSetType(`value`)
  }

  /**
   * A list of resource objects in the resource set.
   */
  public open fun resources(): Any = unwrap(this).getResources()

  /**
   * A list of resource objects in the resource set.
   */
  public open fun resources(`value`: IResolvable) {
    unwrap(this).setResources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of resource objects in the resource set.
   */
  public open fun resources(`value`: List<Any>) {
    unwrap(this).setResources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of resource objects in the resource set.
   */
  public open fun resources(vararg `value`: Any): Unit = resources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag to associate with the parameters for a resource set.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag to associate with the parameters for a resource set.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A tag to associate with the parameters for a resource set.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53recoveryreadiness.CfnResourceSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the resource set to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesetname)
     * @param resourceSetName The name of the resource set to create. 
     */
    public fun resourceSetName(resourceSetName: String)

    /**
     * The resource type of the resources in the resource set. Enter one of the following values for
     * resource type:.
     *
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesettype)
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     * the following values for resource type:. 
     */
    public fun resourceSetType(resourceSetType: String)

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(resources: IResolvable)

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(resources: List<Any>)

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    public fun resources(vararg resources: Any)

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     * @param tags A tag to associate with the parameters for a resource set. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     * @param tags A tag to associate with the parameters for a resource set. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder.create(scope,
        id)

    /**
     * The name of the resource set to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesetname)
     * @param resourceSetName The name of the resource set to create. 
     */
    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * The resource type of the resources in the resource set. Enter one of the following values for
     * resource type:.
     *
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     * AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     * AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     * AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     * AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource.
     *
     * Note that AWS::Route53RecoveryReadiness::DNSTargetResource is only used for this setting. It
     * isn't an actual AWS CloudFormation resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resourcesettype)
     * @param resourceSetType The resource type of the resources in the resource set. Enter one of
     * the following values for resource type:. 
     */
    override fun resourceSetType(resourceSetType: String) {
      cdkBuilder.resourceSetType(resourceSetType)
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of resource objects in the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-resources)
     * @param resources A list of resource objects in the resource set. 
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     * @param tags A tag to associate with the parameters for a resource set. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A tag to associate with the parameters for a resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-resourceset.html#cfn-route53recoveryreadiness-resourceset-tags)
     * @param tags A tag to associate with the parameters for a resource set. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceSet(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet):
        CfnResourceSet = CfnResourceSet(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSet):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet = wrapped.cdkObject
        as software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
  }

  /**
   * A component for DNS/routing control readiness checks and architecture checks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
   * DNSTargetResourceProperty dNSTargetResourceProperty = DNSTargetResourceProperty.builder()
   * .domainName("domainName")
   * .hostedZoneArn("hostedZoneArn")
   * .recordSetId("recordSetId")
   * .recordType("recordType")
   * .targetResource(TargetResourceProperty.builder()
   * .nlbResource(NLBResourceProperty.builder()
   * .arn("arn")
   * .build())
   * .r53Resource(R53ResourceRecordProperty.builder()
   * .domainName("domainName")
   * .recordSetId("recordSetId")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html)
   */
  public interface DNSTargetResourceProperty {
    /**
     * The domain name that acts as an ingress point to a portion of the customer application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-domainname)
     */
    public fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided
     * name of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-hostedzonearn)
     */
    public fun hostedZoneArn(): String? = unwrap(this).getHostedZoneArn()

    /**
     * The Amazon Route 53 record set ID that uniquely identifies a DNS record, given a name and a
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-recordsetid)
     */
    public fun recordSetId(): String? = unwrap(this).getRecordSetId()

    /**
     * The type of DNS record of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-recordtype)
     */
    public fun recordType(): String? = unwrap(this).getRecordType()

    /**
     * The target resource that the Route 53 record points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-targetresource)
     */
    public fun targetResource(): Any? = unwrap(this).getTargetResource()

    /**
     * A builder for [DNSTargetResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName The domain name that acts as an ingress point to a portion of the
       * customer application.
       */
      public fun domainName(domainName: String)

      /**
       * @param hostedZoneArn The hosted zone Amazon Resource Name (ARN) that contains the DNS
       * record with the provided name of the target resource.
       */
      public fun hostedZoneArn(hostedZoneArn: String)

      /**
       * @param recordSetId The Amazon Route 53 record set ID that uniquely identifies a DNS record,
       * given a name and a type.
       */
      public fun recordSetId(recordSetId: String)

      /**
       * @param recordType The type of DNS record of the target resource.
       */
      public fun recordType(recordType: String)

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      public fun targetResource(targetResource: IResolvable)

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      public fun targetResource(targetResource: TargetResourceProperty)

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe4c3c3501872a36e8971e95e7186cfe0741261c4a3201f6c88516a9b257376")
      public fun targetResource(targetResource: TargetResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty.builder()

      /**
       * @param domainName The domain name that acts as an ingress point to a portion of the
       * customer application.
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param hostedZoneArn The hosted zone Amazon Resource Name (ARN) that contains the DNS
       * record with the provided name of the target resource.
       */
      override fun hostedZoneArn(hostedZoneArn: String) {
        cdkBuilder.hostedZoneArn(hostedZoneArn)
      }

      /**
       * @param recordSetId The Amazon Route 53 record set ID that uniquely identifies a DNS record,
       * given a name and a type.
       */
      override fun recordSetId(recordSetId: String) {
        cdkBuilder.recordSetId(recordSetId)
      }

      /**
       * @param recordType The type of DNS record of the target resource.
       */
      override fun recordType(recordType: String) {
        cdkBuilder.recordType(recordType)
      }

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      override fun targetResource(targetResource: IResolvable) {
        cdkBuilder.targetResource(targetResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      override fun targetResource(targetResource: TargetResourceProperty) {
        cdkBuilder.targetResource(targetResource.let(TargetResourceProperty.Companion::unwrap))
      }

      /**
       * @param targetResource The target resource that the Route 53 record points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe4c3c3501872a36e8971e95e7186cfe0741261c4a3201f6c88516a9b257376")
      override fun targetResource(targetResource: TargetResourceProperty.Builder.() -> Unit): Unit =
          targetResource(TargetResourceProperty(targetResource))

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty,
    ) : CdkObject(cdkObject), DNSTargetResourceProperty {
      /**
       * The domain name that acts as an ingress point to a portion of the customer application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-domainname)
       */
      override fun domainName(): String? = unwrap(this).getDomainName()

      /**
       * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided
       * name of the target resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-hostedzonearn)
       */
      override fun hostedZoneArn(): String? = unwrap(this).getHostedZoneArn()

      /**
       * The Amazon Route 53 record set ID that uniquely identifies a DNS record, given a name and a
       * type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-recordsetid)
       */
      override fun recordSetId(): String? = unwrap(this).getRecordSetId()

      /**
       * The type of DNS record of the target resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-recordtype)
       */
      override fun recordType(): String? = unwrap(this).getRecordType()

      /**
       * The target resource that the Route 53 record points to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-dnstargetresource.html#cfn-route53recoveryreadiness-resourceset-dnstargetresource-targetresource)
       */
      override fun targetResource(): Any? = unwrap(this).getTargetResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DNSTargetResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty):
          DNSTargetResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DNSTargetResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DNSTargetResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty
    }
  }

  /**
   * The Network Load Balancer resource that a DNS target resource points to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
   * NLBResourceProperty nLBResourceProperty = NLBResourceProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-nlbresource.html)
   */
  public interface NLBResourceProperty {
    /**
     * The Network Load Balancer resource Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-nlbresource.html#cfn-route53recoveryreadiness-resourceset-nlbresource-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [NLBResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Network Load Balancer resource Amazon Resource Name (ARN).
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty.builder()

      /**
       * @param arn The Network Load Balancer resource Amazon Resource Name (ARN).
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty,
    ) : CdkObject(cdkObject), NLBResourceProperty {
      /**
       * The Network Load Balancer resource Amazon Resource Name (ARN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-nlbresource.html#cfn-route53recoveryreadiness-resourceset-nlbresource-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NLBResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty):
          NLBResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? NLBResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NLBResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty
    }
  }

  /**
   * The Amazon Route 53 resource that a DNS target resource record points to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
   * R53ResourceRecordProperty r53ResourceRecordProperty = R53ResourceRecordProperty.builder()
   * .domainName("domainName")
   * .recordSetId("recordSetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html)
   */
  public interface R53ResourceRecordProperty {
    /**
     * The DNS target domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html#cfn-route53recoveryreadiness-resourceset-r53resourcerecord-domainname)
     */
    public fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The Amazon Route 53 Resource Record Set ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html#cfn-route53recoveryreadiness-resourceset-r53resourcerecord-recordsetid)
     */
    public fun recordSetId(): String? = unwrap(this).getRecordSetId()

    /**
     * A builder for [R53ResourceRecordProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName The DNS target domain name.
       */
      public fun domainName(domainName: String)

      /**
       * @param recordSetId The Amazon Route 53 Resource Record Set ID.
       */
      public fun recordSetId(recordSetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty.builder()

      /**
       * @param domainName The DNS target domain name.
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param recordSetId The Amazon Route 53 Resource Record Set ID.
       */
      override fun recordSetId(recordSetId: String) {
        cdkBuilder.recordSetId(recordSetId)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty,
    ) : CdkObject(cdkObject), R53ResourceRecordProperty {
      /**
       * The DNS target domain name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html#cfn-route53recoveryreadiness-resourceset-r53resourcerecord-domainname)
       */
      override fun domainName(): String? = unwrap(this).getDomainName()

      /**
       * The Amazon Route 53 Resource Record Set ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-r53resourcerecord.html#cfn-route53recoveryreadiness-resourceset-r53resourcerecord-recordsetid)
       */
      override fun recordSetId(): String? = unwrap(this).getRecordSetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): R53ResourceRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty):
          R53ResourceRecordProperty = CdkObjectWrappers.wrap(cdkObject) as?
          R53ResourceRecordProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: R53ResourceRecordProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty
    }
  }

  /**
   * The resource element of a resource set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
   * ResourceProperty resourceProperty = ResourceProperty.builder()
   * .componentId("componentId")
   * .dnsTargetResource(DNSTargetResourceProperty.builder()
   * .domainName("domainName")
   * .hostedZoneArn("hostedZoneArn")
   * .recordSetId("recordSetId")
   * .recordType("recordType")
   * .targetResource(TargetResourceProperty.builder()
   * .nlbResource(NLBResourceProperty.builder()
   * .arn("arn")
   * .build())
   * .r53Resource(R53ResourceRecordProperty.builder()
   * .domainName("domainName")
   * .recordSetId("recordSetId")
   * .build())
   * .build())
   * .build())
   * .readinessScopes(List.of("readinessScopes"))
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html)
   */
  public interface ResourceProperty {
    /**
     * The component identifier of the resource, generated when DNS target resource is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-componentid)
     */
    public fun componentId(): String? = unwrap(this).getComponentId()

    /**
     * A component for DNS/routing control readiness checks.
     *
     * This is a required setting when `ResourceSet` `ResourceSetType` is set to
     * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
     * `ResourceSetType` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-dnstargetresource)
     */
    public fun dnsTargetResource(): Any? = unwrap(this).getDnsTargetResource()

    /**
     * The recovery group Amazon Resource Name (ARN) or the cell ARN that the readiness checks for
     * this resource set are scoped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-readinessscopes)
     */
    public fun readinessScopes(): List<String> = unwrap(this).getReadinessScopes() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the AWS resource.
     *
     * This is a required setting for all `ResourceSet` `ResourceSetType` settings except
     * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set this when `ResourceSetType` is
     * set to `AWS::Route53RecoveryReadiness::DNSTargetResource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-resourcearn)
     */
    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    /**
     * A builder for [ResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentId The component identifier of the resource, generated when DNS target
       * resource is used.
       */
      public fun componentId(componentId: String)

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      public fun dnsTargetResource(dnsTargetResource: IResolvable)

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      public fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty)

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83baffb106efe707b424ff93ce00925d442bb572f3758234141759a3330018c1")
      public fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty.Builder.() -> Unit)

      /**
       * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that
       * the readiness checks for this resource set are scoped to.
       */
      public fun readinessScopes(readinessScopes: List<String>)

      /**
       * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that
       * the readiness checks for this resource set are scoped to.
       */
      public fun readinessScopes(vararg readinessScopes: String)

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the AWS resource.
       * This is a required setting for all `ResourceSet` `ResourceSetType` settings except
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set this when `ResourceSetType` is
       * set to `AWS::Route53RecoveryReadiness::DNSTargetResource` .
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty.builder()

      /**
       * @param componentId The component identifier of the resource, generated when DNS target
       * resource is used.
       */
      override fun componentId(componentId: String) {
        cdkBuilder.componentId(componentId)
      }

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      override fun dnsTargetResource(dnsTargetResource: IResolvable) {
        cdkBuilder.dnsTargetResource(dnsTargetResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      override fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty) {
        cdkBuilder.dnsTargetResource(dnsTargetResource.let(DNSTargetResourceProperty.Companion::unwrap))
      }

      /**
       * @param dnsTargetResource A component for DNS/routing control readiness checks.
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83baffb106efe707b424ff93ce00925d442bb572f3758234141759a3330018c1")
      override
          fun dnsTargetResource(dnsTargetResource: DNSTargetResourceProperty.Builder.() -> Unit):
          Unit = dnsTargetResource(DNSTargetResourceProperty(dnsTargetResource))

      /**
       * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that
       * the readiness checks for this resource set are scoped to.
       */
      override fun readinessScopes(readinessScopes: List<String>) {
        cdkBuilder.readinessScopes(readinessScopes)
      }

      /**
       * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that
       * the readiness checks for this resource set are scoped to.
       */
      override fun readinessScopes(vararg readinessScopes: String): Unit =
          readinessScopes(readinessScopes.toList())

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the AWS resource.
       * This is a required setting for all `ResourceSet` `ResourceSetType` settings except
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set this when `ResourceSetType` is
       * set to `AWS::Route53RecoveryReadiness::DNSTargetResource` .
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty,
    ) : CdkObject(cdkObject), ResourceProperty {
      /**
       * The component identifier of the resource, generated when DNS target resource is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-componentid)
       */
      override fun componentId(): String? = unwrap(this).getComponentId()

      /**
       * A component for DNS/routing control readiness checks.
       *
       * This is a required setting when `ResourceSet` `ResourceSetType` is set to
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other
       * `ResourceSetType` setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-dnstargetresource)
       */
      override fun dnsTargetResource(): Any? = unwrap(this).getDnsTargetResource()

      /**
       * The recovery group Amazon Resource Name (ARN) or the cell ARN that the readiness checks for
       * this resource set are scoped to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-readinessscopes)
       */
      override fun readinessScopes(): List<String> = unwrap(this).getReadinessScopes() ?:
          emptyList()

      /**
       * The Amazon Resource Name (ARN) of the AWS resource.
       *
       * This is a required setting for all `ResourceSet` `ResourceSetType` settings except
       * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set this when `ResourceSetType` is
       * set to `AWS::Route53RecoveryReadiness::DNSTargetResource` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-resource.html#cfn-route53recoveryreadiness-resourceset-resource-resourcearn)
       */
      override fun resourceArn(): String? = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty):
          ResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty
    }
  }

  /**
   * The target resource that the Route 53 record points to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
   * TargetResourceProperty targetResourceProperty = TargetResourceProperty.builder()
   * .nlbResource(NLBResourceProperty.builder()
   * .arn("arn")
   * .build())
   * .r53Resource(R53ResourceRecordProperty.builder()
   * .domainName("domainName")
   * .recordSetId("recordSetId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html)
   */
  public interface TargetResourceProperty {
    /**
     * The Network Load Balancer resource that a DNS target resource points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html#cfn-route53recoveryreadiness-resourceset-targetresource-nlbresource)
     */
    public fun nlbResource(): Any? = unwrap(this).getNlbResource()

    /**
     * The Route 53 resource that a DNS target resource record points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html#cfn-route53recoveryreadiness-resourceset-targetresource-r53resource)
     */
    public fun r53Resource(): Any? = unwrap(this).getR53Resource()

    /**
     * A builder for [TargetResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      public fun nlbResource(nlbResource: IResolvable)

      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      public fun nlbResource(nlbResource: NLBResourceProperty)

      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("001848c7e336aaea9381dbaf6bca573a846b4eeff24e5df9008313c8fc40c4e4")
      public fun nlbResource(nlbResource: NLBResourceProperty.Builder.() -> Unit)

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      public fun r53Resource(r53Resource: IResolvable)

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      public fun r53Resource(r53Resource: R53ResourceRecordProperty)

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12521b6ef63fdb393ae03d277f774d30d5112e6c8ff55fb1186767ea126bc8a3")
      public fun r53Resource(r53Resource: R53ResourceRecordProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty.Builder
          =
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty.builder()

      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      override fun nlbResource(nlbResource: IResolvable) {
        cdkBuilder.nlbResource(nlbResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      override fun nlbResource(nlbResource: NLBResourceProperty) {
        cdkBuilder.nlbResource(nlbResource.let(NLBResourceProperty.Companion::unwrap))
      }

      /**
       * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("001848c7e336aaea9381dbaf6bca573a846b4eeff24e5df9008313c8fc40c4e4")
      override fun nlbResource(nlbResource: NLBResourceProperty.Builder.() -> Unit): Unit =
          nlbResource(NLBResourceProperty(nlbResource))

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      override fun r53Resource(r53Resource: IResolvable) {
        cdkBuilder.r53Resource(r53Resource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      override fun r53Resource(r53Resource: R53ResourceRecordProperty) {
        cdkBuilder.r53Resource(r53Resource.let(R53ResourceRecordProperty.Companion::unwrap))
      }

      /**
       * @param r53Resource The Route 53 resource that a DNS target resource record points to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12521b6ef63fdb393ae03d277f774d30d5112e6c8ff55fb1186767ea126bc8a3")
      override fun r53Resource(r53Resource: R53ResourceRecordProperty.Builder.() -> Unit): Unit =
          r53Resource(R53ResourceRecordProperty(r53Resource))

      public fun build():
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty,
    ) : CdkObject(cdkObject), TargetResourceProperty {
      /**
       * The Network Load Balancer resource that a DNS target resource points to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html#cfn-route53recoveryreadiness-resourceset-targetresource-nlbresource)
       */
      override fun nlbResource(): Any? = unwrap(this).getNlbResource()

      /**
       * The Route 53 resource that a DNS target resource record points to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html#cfn-route53recoveryreadiness-resourceset-targetresource-r53resource)
       */
      override fun r53Resource(): Any? = unwrap(this).getR53Resource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty):
          TargetResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetResourceProperty):
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty
    }
  }
}
