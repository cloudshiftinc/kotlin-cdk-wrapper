package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHostedZone internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the set of name servers for the specific hosted zone. For example: `ns1.example.com` .
   *
   * This attribute is not supported for private hosted zones.
   */
  public open fun attrNameServers(): List<String> = unwrap(this).getAttrNameServers()

  /**
   * A complex type that contains an optional comment.
   */
  public open fun hostedZoneConfig(): Any? = unwrap(this).getHostedZoneConfig()

  /**
   * A complex type that contains an optional comment.
   */
  public open fun hostedZoneConfig(`value`: IResolvable) {
    unwrap(this).setHostedZoneConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type that contains an optional comment.
   */
  public open fun hostedZoneConfig(`value`: HostedZoneConfigProperty) {
    unwrap(this).setHostedZoneConfig(`value`.let(HostedZoneConfigProperty::unwrap))
  }

  /**
   * A complex type that contains an optional comment.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c15f2703746639fc60927ce1df23afdfd15f141ac6d056ae04695933b407474e")
  public open fun hostedZoneConfig(`value`: HostedZoneConfigProperty.Builder.() -> Unit): Unit =
      hostedZoneConfig(HostedZoneConfigProperty(`value`))

  /**
   * Adds, edits, or deletes tags for a health check or a hosted zone.
   */
  public open fun hostedZoneTagsRaw(): List<HostedZoneTagProperty> =
      unwrap(this).getHostedZoneTagsRaw()?.map(HostedZoneTagProperty::wrap) ?: emptyList()

  /**
   * Adds, edits, or deletes tags for a health check or a hosted zone.
   */
  public open fun hostedZoneTagsRaw(`value`: List<HostedZoneTagProperty>) {
    unwrap(this).setHostedZoneTagsRaw(`value`.map(HostedZoneTagProperty::unwrap))
  }

  /**
   * Adds, edits, or deletes tags for a health check or a hosted zone.
   */
  public open fun hostedZoneTagsRaw(vararg `value`: HostedZoneTagProperty): Unit =
      hostedZoneTagsRaw(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the domain.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the domain.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Creates a configuration for DNS query logging.
   */
  public open fun queryLoggingConfig(): Any? = unwrap(this).getQueryLoggingConfig()

  /**
   * Creates a configuration for DNS query logging.
   */
  public open fun queryLoggingConfig(`value`: IResolvable) {
    unwrap(this).setQueryLoggingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Creates a configuration for DNS query logging.
   */
  public open fun queryLoggingConfig(`value`: QueryLoggingConfigProperty) {
    unwrap(this).setQueryLoggingConfig(`value`.let(QueryLoggingConfigProperty::unwrap))
  }

  /**
   * Creates a configuration for DNS query logging.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2ebcb9eb303e4cc4b602fbc39a41a00acbb69e169ae626b2822b86689ef91bc")
  public open fun queryLoggingConfig(`value`: QueryLoggingConfigProperty.Builder.() -> Unit): Unit =
      queryLoggingConfig(QueryLoggingConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   */
  public open fun vpcs(): Any? = unwrap(this).getVpcs()

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   */
  public open fun vpcs(`value`: IResolvable) {
    unwrap(this).setVpcs(`value`.let(IResolvable::unwrap))
  }

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   */
  public open fun vpcs(__idx_ac66f0: List<Any>) {
    unwrap(this).setVpcs(__idx_ac66f0)
  }

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   */
  public open fun vpcs(vararg __idx_ac66f0: Any): Unit = vpcs(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CfnHostedZone].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    public fun hostedZoneConfig(hostedZoneConfig: IResolvable)

    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    public fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty)

    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf6d2fd2ccbcb97d5d9641544ccb5faf470a34337d7035c5365a3729b521b0c3")
    public fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty.Builder.() -> Unit)

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     *
     * For information about using tags for cost allocation, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
     * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
     */
    public fun hostedZoneTags(hostedZoneTags: List<HostedZoneTagProperty>)

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     *
     * For information about using tags for cost allocation, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
     * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
     */
    public fun hostedZoneTags(vararg hostedZoneTags: HostedZoneTagProperty)

    /**
     * The name of the domain.
     *
     * Specify a fully qualified domain name, for example, *www.example.com* . The trailing dot is
     * optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route
     * 53 treats *www.example.com* (without a trailing dot) and *www.example.com.* (with a trailing
     * dot) as identical.
     *
     * If you're creating a public hosted zone, this is the name you have registered with your DNS
     * registrar. If your domain name is registered with a registrar other than Route 53, change the
     * name servers for your domain to the set of `NameServers` that are returned by the `Fn::GetAtt`
     * intrinsic function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
     * @param name The name of the domain. 
     */
    public fun name(name: String)

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    public fun queryLoggingConfig(queryLoggingConfig: IResolvable)

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    public fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty)

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b0b16f06ec058da9c9f85788ccf6a4e7407a109dfb778d25b1f2338ce86c99")
    public fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty.Builder.() -> Unit)

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    public fun vpcs(vpcs: IResolvable)

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    public fun vpcs(vpcs: List<Any>)

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    public fun vpcs(vararg vpcs: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHostedZone.Builder =
        software.amazon.awscdk.services.route53.CfnHostedZone.Builder.create(scope, id)

    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    override fun hostedZoneConfig(hostedZoneConfig: IResolvable) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(IResolvable::unwrap))
    }

    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    override fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(HostedZoneConfigProperty::unwrap))
    }

    /**
     * A complex type that contains an optional comment.
     *
     * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
     * @param hostedZoneConfig A complex type that contains an optional comment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf6d2fd2ccbcb97d5d9641544ccb5faf470a34337d7035c5365a3729b521b0c3")
    override fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty.Builder.() -> Unit):
        Unit = hostedZoneConfig(HostedZoneConfigProperty(hostedZoneConfig))

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     *
     * For information about using tags for cost allocation, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
     * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
     */
    override fun hostedZoneTags(hostedZoneTags: List<HostedZoneTagProperty>) {
      cdkBuilder.hostedZoneTags(hostedZoneTags.map(HostedZoneTagProperty::unwrap))
    }

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     *
     * For information about using tags for cost allocation, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *AWS Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
     * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
     */
    override fun hostedZoneTags(vararg hostedZoneTags: HostedZoneTagProperty): Unit =
        hostedZoneTags(hostedZoneTags.toList())

    /**
     * The name of the domain.
     *
     * Specify a fully qualified domain name, for example, *www.example.com* . The trailing dot is
     * optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route
     * 53 treats *www.example.com* (without a trailing dot) and *www.example.com.* (with a trailing
     * dot) as identical.
     *
     * If you're creating a public hosted zone, this is the name you have registered with your DNS
     * registrar. If your domain name is registered with a registrar other than Route 53, change the
     * name servers for your domain to the set of `NameServers` that are returned by the `Fn::GetAtt`
     * intrinsic function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
     * @param name The name of the domain. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    override fun queryLoggingConfig(queryLoggingConfig: IResolvable) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(IResolvable::unwrap))
    }

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    override fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(QueryLoggingConfigProperty::unwrap))
    }

    /**
     * Creates a configuration for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * DNS query logs contain information about the queries that Route 53 receives for a specified
     * public hosted zone, such as the following:
     *
     * * Route 53 edge location that responded to the DNS query
     * * Domain or subdomain that was requested
     * * DNS record type, such as A or AAAA
     * * DNS response code, such as `NoError` or `ServFail`
     * * **Log Group and Resource Policy** - Before you create a query logging configuration,
     * perform the following operations.
     *
     *
     * If you create a query logging configuration using the Route 53 console, Route 53 performs
     * these operations automatically.
     *
     *
     * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
     * create a query logging configuration. Note the following:
     * * You must create the log group in the us-east-1 region.
     * * You must use the same AWS account to create the log group and the hosted zone that you want
     * to configure query logging for.
     * * When you create log groups for query logging, we recommend that you use a consistent
     * prefix, for example:
     *
     * `/aws/route53/ *hosted zone name*`
     *
     * In the next step, you'll create a resource policy, which controls access to one or more log
     * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
     * number of resource policies that you can create, so we recommend that you use a consistent
     * prefix so you can use the same resource policy for all the log groups that you create for query
     * logging.
     *
     * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs
     * to create log streams and to send query logs to log streams. For the value of `Resource` ,
     * specify the ARN for the log group that you created in the previous step. To use the same
     * resource policy for all the CloudWatch Logs log groups that you created for query logging
     * configurations, replace the hosted zone name with `*` , for example:
     *
     * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
     *
     * To avoid the confused deputy problem, a security issue where an entity without a permission
     * for an action can coerce a more-privileged entity to perform it, you can optionally limit the
     * permissions that a service has to a resource in a resource-based policy by supplying the
     * following values:
     *
     * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
     * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
     * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
     * logging configuration. For example, `aws:SourceAccount:111111111111` .
     *
     * For more information, see [The confused deputy
     * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
     * User Guide* .
     *
     *
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the
     * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
     *
     *
     * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
     * DNS query logging, it does the following:
     * * Creates a log stream for an edge location the first time that the edge location responds to
     * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
     * 53 responds to for that edge location.
     * * Begins to send query logs to the applicable log stream.
     *
     * The name of each log stream is in the following format:
     *
     * `*hosted zone ID* / *edge location code*`
     *
     * The edge location code is a three-letter code and an arbitrarily assigned number, for
     * example, DFW3. The three-letter code typically corresponds with the International Air Transport
     * Association airport code for an airport near the edge location. (These abbreviations might
     * change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the
     * [Route 53 Product Details](https://docs.aws.amazon.com/route53/details/) page.
     *
     * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers
     * forward to Route 53. If a DNS resolver has already cached the response to a query (such as the
     * IP address for a load balancer for example.com), the resolver will continue to return the cached
     * response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query logs might contain
     * information about only one query out of every several thousand queries that are submitted to
     * DNS. For more information about how DNS works, see [Routing Internet Traffic to Your Website or
     * Web
     * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
     * in the *Amazon Route 53 Developer Guide* .
     * * **Log File Format** - For a list of the values in each query log and the format of each
     * value, see [Logging DNS
     * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the
     * *Amazon Route 53 Developer Guide* .
     * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
     * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch
     * Logs, delete the query logging configuration. For more information, see
     * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
     * @param queryLoggingConfig Creates a configuration for DNS query logging. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b0b16f06ec058da9c9f85788ccf6a4e7407a109dfb778d25b1f2338ce86c99")
    override
        fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty.Builder.() -> Unit):
        Unit = queryLoggingConfig(QueryLoggingConfigProperty(queryLoggingConfig))

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    override fun vpcs(vpcs: IResolvable) {
      cdkBuilder.vpcs(vpcs.let(IResolvable::unwrap))
    }

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    override fun vpcs(vpcs: List<Any>) {
      cdkBuilder.vpcs(vpcs)
    }

    /**
     * *Private hosted zones:* A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
     * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
     * that are associated with the specified hosted zone. 
     */
    override fun vpcs(vararg vpcs: Any): Unit = vpcs(vpcs.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHostedZone = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnHostedZone.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone):
        CfnHostedZone = CfnHostedZone(cdkObject)

    internal fun unwrap(wrapped: CfnHostedZone):
        software.amazon.awscdk.services.route53.CfnHostedZone = wrapped.cdkObject
  }

  public interface QueryLoggingConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is
     * publishing logs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
     */
    public fun cloudWatchLogsLogGroupArn(): String

    /**
     * A builder for [QueryLoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsLogGroupArn The Amazon Resource Name (ARN) of the CloudWatch Logs log
       * group that Amazon Route 53 is publishing logs to. 
       */
      public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.builder()

      /**
       * @param cloudWatchLogsLogGroupArn The Amazon Resource Name (ARN) of the CloudWatch Logs log
       * group that Amazon Route 53 is publishing logs to. 
       */
      override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty,
    ) : CdkObject(cdkObject), QueryLoggingConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is
       * publishing logs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn)
       */
      override fun cloudWatchLogsLogGroupArn(): String = unwrap(this).getCloudWatchLogsLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryLoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty):
          QueryLoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryLoggingConfigProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty
    }
  }

  public interface VPCProperty {
    /**
     * *Private hosted zones only:* The ID of an Amazon VPC.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html#cfn-route53-hostedzone-vpc-vpcid)
     */
    public fun vpcId(): String

    /**
     * *Private hosted zones only:* The region that an Amazon VPC was created in.
     *
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html#cfn-route53-hostedzone-vpc-vpcregion)
     */
    public fun vpcRegion(): String

    /**
     * A builder for [VPCProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcId *Private hosted zones only:* The ID of an Amazon VPC. 
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       */
      public fun vpcId(vpcId: String)

      /**
       * @param vpcRegion *Private hosted zones only:* The region that an Amazon VPC was created in.
       * 
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       */
      public fun vpcRegion(vpcRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.builder()

      /**
       * @param vpcId *Private hosted zones only:* The ID of an Amazon VPC. 
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      /**
       * @param vpcRegion *Private hosted zones only:* The region that an Amazon VPC was created in.
       * 
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       */
      override fun vpcRegion(vpcRegion: String) {
        cdkBuilder.vpcRegion(vpcRegion)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty,
    ) : CdkObject(cdkObject), VPCProperty {
      /**
       * *Private hosted zones only:* The ID of an Amazon VPC.
       *
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html#cfn-route53-hostedzone-vpc-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()

      /**
       * *Private hosted zones only:* The region that an Amazon VPC was created in.
       *
       *
       * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html#cfn-route53-hostedzone-vpc-vpcregion)
       */
      override fun vpcRegion(): String = unwrap(this).getVpcRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty):
          VPCProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty
    }
  }

  public interface HostedZoneTagProperty {
    /**
     * The value of `Key` depends on the operation that you want to perform:.
     *
     * * *Add a tag to a health check or hosted zone* : `Key` is the name that you want to give the
     * new tag.
     * * *Edit a tag* : `Key` is the name of the tag that you want to change the `Value` for.
     * * *Delete a key* : `Key` is the name of the tag you want to remove.
     * * *Give a name to a health check* : Edit the default `Name` tag. In the Amazon Route 53
     * console, the list of your health checks includes a *Name* column that lets you see the name that
     * you've given to each health check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html#cfn-route53-hostedzone-hostedzonetag-key)
     */
    public fun key(): String

    /**
     * The value of `Value` depends on the operation that you want to perform:.
     *
     * * *Add a tag to a health check or hosted zone* : `Value` is the value that you want to give
     * the new tag.
     * * *Edit a tag* : `Value` is the new value that you want to assign the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html#cfn-route53-hostedzone-hostedzonetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [HostedZoneTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The value of `Key` depends on the operation that you want to perform:. 
       * * *Add a tag to a health check or hosted zone* : `Key` is the name that you want to give
       * the new tag.
       * * *Edit a tag* : `Key` is the name of the tag that you want to change the `Value` for.
       * * *Delete a key* : `Key` is the name of the tag you want to remove.
       * * *Give a name to a health check* : Edit the default `Name` tag. In the Amazon Route 53
       * console, the list of your health checks includes a *Name* column that lets you see the name
       * that you've given to each health check.
       */
      public fun key(key: String)

      /**
       * @param value The value of `Value` depends on the operation that you want to perform:. 
       * * *Add a tag to a health check or hosted zone* : `Value` is the value that you want to give
       * the new tag.
       * * *Edit a tag* : `Value` is the new value that you want to assign the tag.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.builder()

      /**
       * @param key The value of `Key` depends on the operation that you want to perform:. 
       * * *Add a tag to a health check or hosted zone* : `Key` is the name that you want to give
       * the new tag.
       * * *Edit a tag* : `Key` is the name of the tag that you want to change the `Value` for.
       * * *Delete a key* : `Key` is the name of the tag you want to remove.
       * * *Give a name to a health check* : Edit the default `Name` tag. In the Amazon Route 53
       * console, the list of your health checks includes a *Name* column that lets you see the name
       * that you've given to each health check.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of `Value` depends on the operation that you want to perform:. 
       * * *Add a tag to a health check or hosted zone* : `Value` is the value that you want to give
       * the new tag.
       * * *Edit a tag* : `Value` is the new value that you want to assign the tag.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty,
    ) : CdkObject(cdkObject), HostedZoneTagProperty {
      /**
       * The value of `Key` depends on the operation that you want to perform:.
       *
       * * *Add a tag to a health check or hosted zone* : `Key` is the name that you want to give
       * the new tag.
       * * *Edit a tag* : `Key` is the name of the tag that you want to change the `Value` for.
       * * *Delete a key* : `Key` is the name of the tag you want to remove.
       * * *Give a name to a health check* : Edit the default `Name` tag. In the Amazon Route 53
       * console, the list of your health checks includes a *Name* column that lets you see the name
       * that you've given to each health check.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html#cfn-route53-hostedzone-hostedzonetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of `Value` depends on the operation that you want to perform:.
       *
       * * *Add a tag to a health check or hosted zone* : `Value` is the value that you want to give
       * the new tag.
       * * *Edit a tag* : `Value` is the new value that you want to assign the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html#cfn-route53-hostedzone-hostedzonetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty):
          HostedZoneTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostedZoneTagProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty
    }
  }

  public interface HostedZoneConfigProperty {
    /**
     * Any comments that you want to include about the hosted zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * A builder for [HostedZoneConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment Any comments that you want to include about the hosted zone.
       */
      public fun comment(comment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty.builder()

      /**
       * @param comment Any comments that you want to include about the hosted zone.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty,
    ) : CdkObject(cdkObject), HostedZoneConfigProperty {
      /**
       * Any comments that you want to include about the hosted zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzoneconfig.html#cfn-route53-hostedzone-hostedzoneconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty):
          HostedZoneConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostedZoneConfigProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty
    }
  }
}
