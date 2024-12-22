@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRecordSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnRecordSetProps cfnRecordSetProps = CfnRecordSetProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .aliasTarget(AliasTargetProperty.builder()
 * .dnsName("dnsName")
 * .hostedZoneId("hostedZoneId")
 * // the properties below are optional
 * .evaluateTargetHealth(false)
 * .build())
 * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
 * .collectionId("collectionId")
 * .locationName("locationName")
 * .build())
 * .comment("comment")
 * .failover("failover")
 * .geoLocation(GeoLocationProperty.builder()
 * .continentCode("continentCode")
 * .countryCode("countryCode")
 * .subdivisionCode("subdivisionCode")
 * .build())
 * .geoProximityLocation(GeoProximityLocationProperty.builder()
 * .awsRegion("awsRegion")
 * .bias(123)
 * .coordinates(CoordinatesProperty.builder()
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .localZoneGroup("localZoneGroup")
 * .build())
 * .healthCheckId("healthCheckId")
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .multiValueAnswer(false)
 * .region("region")
 * .resourceRecords(List.of("resourceRecords"))
 * .setIdentifier("setIdentifier")
 * .ttl("ttl")
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html)
 */
public interface CfnRecordSetProps {
  /**
   * *Alias resource record sets only:* Information about the AWS resource, such as a CloudFront
   * distribution or an Amazon S3 bucket, that you want to route traffic to.
   *
   * If you're creating resource records sets for a private hosted zone, note the following:
   *
   * * You can't create an alias resource record set in a private hosted zone to route traffic to a
   * CloudFront distribution.
   * * For information about creating failover resource record sets in a private hosted zone, see
   * [Configuring Failover in a Private Hosted
   * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
   * in the *Amazon Route 53 Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-aliastarget)
   */
  public fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

  /**
   * The object that is specified in resource record set object when you are linking a resource
   * record set to a CIDR location.
   *
   * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
   * `CollectionId` is still required for default record.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-cidrroutingconfig)
   */
  public fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

  /**
   * *Optional:* Any comments you want to include about a change batch request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-comment)
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * *Failover resource record sets only:* To configure failover, you add the `Failover` element to
   * two resource record sets.
   *
   * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the other
   * resource record set, you specify `SECONDARY` . In addition, you include the `HealthCheckId`
   * element and specify the health check that you want Amazon Route 53 to perform for each resource
   * record set.
   *
   * Except where noted, the following failover behaviors assume that you have included the
   * `HealthCheckId` element in both resource record sets:
   *
   * * When the primary resource record set is healthy, Route 53 responds to DNS queries with the
   * applicable value from the primary resource record set regardless of the health of the secondary
   * resource record set.
   * * When the primary resource record set is unhealthy and the secondary resource record set is
   * healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource
   * record set.
   * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with
   * the applicable value from the primary resource record set regardless of the health of the primary
   * resource record set.
   * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
   * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
   * applicable value from the secondary resource record set. This is true regardless of the health of
   * the associated endpoint.
   *
   * You can't create non-failover resource record sets that have the same values for the `Name` and
   * `Type` elements as failover resource record sets.
   *
   * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
   * element and set the value to true.
   *
   * For more information about configuring failover for Route 53, see the following topics in the
   * *Amazon Route 53 Developer Guide* :
   *
   * * [Route 53 Health Checks and DNS
   * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
   * * [Configuring Failover in a Private Hosted
   * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-failover)
   */
  public fun failover(): String? = unwrap(this).getFailover()

  /**
   * *Geolocation resource record sets only:* A complex type that lets you control how Amazon Route
   * 53 responds to DNS queries based on the geographic origin of the query.
   *
   * For example, if you want all queries from Africa to be routed to a web server with an IP
   * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a `ContinentCode`
   * of `AF` .
   *
   * If you create separate resource record sets for overlapping geographic regions (for example,
   * one resource record set for a continent and one for a country on the same continent), priority
   * goes to the smallest geographic region. This allows you to route most queries for a continent to
   * one resource and to route queries for a country on that continent to a different resource.
   *
   * You can't create two geolocation resource record sets that specify the same geographic
   * location.
   *
   * The value `*` in the `CountryCode` element matches all geographic locations that aren't
   * specified in other geolocation resource record sets that have the same values for the `Name` and
   * `Type` elements.
   *
   *
   * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
   * mapped to geographic locations, so even if you create geolocation resource record sets that cover
   * all seven continents, Route 53 will receive some DNS queries from locations that it can't
   * identify. We recommend that you create a resource record set for which the value of `CountryCode`
   * is `*` . Two groups of queries are routed to the resource that you specify in this record: queries
   * that come from locations for which you haven't created geolocation resource record sets and
   * queries from IP addresses that aren't mapped to a location. If you don't create a `*` resource
   * record set, Route 53 returns a "no answer" response for queries from those locations.
   *
   *
   * You can't create non-geolocation resource record sets that have the same values for the `Name`
   * and `Type` elements as geolocation resource record sets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-geolocation)
   */
  public fun geoLocation(): Any? = unwrap(this).getGeoLocation()

  /**
   * *GeoproximityLocation resource record sets only:* A complex type that lets you control how
   * Route 53 responds to DNS queries based on the geographic origin of the query and your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-geoproximitylocation)
   */
  public fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

  /**
   * If you want Amazon Route 53 to return this resource record set in response to a DNS query only
   * when the status of a health check is healthy, include the `HealthCheckId` element and specify the
   * ID of the applicable health check.
   *
   * Route 53 determines whether a resource record set is healthy based on one of the following:
   *
   * * By periodically sending a request to the endpoint that is specified in the health check
   * * By aggregating the status of a specified group of health checks (calculated health checks)
   * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
   *
   *
   * Route 53 doesn't check the health of the endpoint that is specified in the resource record set,
   * for example, the endpoint specified by the IP address in the `Value` element. When you add a
   * `HealthCheckId` element to a resource record set, Route 53 checks the health of the endpoint that
   * you specified in the health check.
   *
   *
   * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
   *
   * * [How Amazon Route 53 Determines Whether an Endpoint Is
   * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
   * * [Route 53 Health Checks and DNS
   * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
   * * [Configuring Failover in a Private Hosted
   * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
   *
   * *When to Specify HealthCheckId*
   *
   * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two or
   * more resource record sets to respond to a DNS query, and you want Route 53 to base the choice in
   * part on the status of a health check. Configuring health checks makes sense only in the following
   * configurations:
   *
   * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
   * resource record sets that have the same routing policy, name, and type (such as multiple weighted
   * records named www.example.com with a type of A) and you specify health check IDs for all the
   * resource record sets.
   *
   * If the health check status for a resource record set is healthy, Route 53 includes the record
   * among the records that it responds to DNS queries with.
   *
   * If the health check status for a resource record set is unhealthy, Route 53 stops responding to
   * DNS queries using the value for that resource record set.
   *
   * If the health check status for all resource record sets in the group is unhealthy, Route 53
   * considers all resource record sets in the group healthy and responds to DNS queries accordingly.
   *
   * * *Alias resource record sets* : You specify the following settings:
   * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
   * resource record sets that have the same routing policy, name, and type (such as multiple weighted
   * records named www.example.com with a type of A).
   * * You configure the alias resource record set to route traffic to a non-alias resource record
   * set in the same hosted zone.
   * * You specify a health check ID for the non-alias resource record set.
   *
   * If the health check status is healthy, Route 53 considers the alias resource record set to be
   * healthy and includes the alias record among the records that it responds to DNS queries with.
   *
   * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
   * alias resource record set.
   *
   *
   * The alias resource record set can also route traffic to a *group* of non-alias resource record
   * sets that have the same routing policy, name, and type. In that configuration, associate health
   * checks with all of the resource record sets in the group of non-alias resource record sets.
   *
   *
   * *Geolocation Routing*
   *
   * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
   * resource record set for the larger, associated geographic region. For example, suppose you have
   * resource record sets for a state in the United States, for the entire United States, for North
   * America, and a resource record set that has `*` for `CountryCode` is `*` , which applies to all
   * locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for
   * healthy resource record sets in the following order until it finds a resource record set for which
   * the endpoint is healthy:
   *
   * * The United States
   * * North America
   * * The default resource record set
   *
   * *Specifying the Health Check Endpoint by Domain Name*
   *
   * If your health checks specify the endpoint only by domain name, we recommend that you create a
   * separate health check for each endpoint. For example, create a health check for each `HTTP` server
   * that is serving content for `www.example.com` . For the value of `FullyQualifiedDomainName` ,
   * specify the domain name of the server (such as `us-east-2-www.example.com` ), not the name of the
   * resource record sets ( `www.example.com` ).
   *
   *
   * Health check results will be unpredictable if you do the following:
   *
   * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name of a
   * resource record set.
   * * Associate that health check with the resource record set.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-healthcheckid)
   */
  public fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

  /**
   * The ID of the hosted zone that you want to create records in.
   *
   * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
   * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
   */
  public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  /**
   * The name of the hosted zone that you want to create records in.
   *
   * You must include a trailing dot (for example, `www.example.com.` ) as part of the
   * `HostedZoneName` .
   *
   * When you create a stack using an AWS::Route53::RecordSet that specifies `HostedZoneName` , AWS
   * CloudFormation attempts to find a hosted zone whose name matches the HostedZoneName. If AWS
   * CloudFormation cannot find a hosted zone with a matching domain name, or if there is more than one
   * hosted zone with the specified domain name, AWS CloudFormation will not create the stack.
   *
   * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
   * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-hostedzonename)
   */
  public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  /**
   * *Multivalue answer resource record sets only* : To route traffic approximately randomly to
   * multiple resources, such as web servers, create one multivalue answer record for each resource and
   * specify `true` for `MultiValueAnswer` .
   *
   * Note the following:
   *
   * * If you associate a health check with a multivalue answer resource record set, Amazon Route 53
   * responds to DNS queries with the corresponding IP address only when the health check is healthy.
   * * If you don't associate a health check with a multivalue answer record, Route 53 always
   * considers the record to be healthy.
   * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or fewer
   * healthy records, Route 53 responds to all DNS queries with all the healthy records.
   * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
   * with different combinations of healthy records.
   * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
   * records.
   * * If a resource becomes unavailable after a resolver caches a response, client software
   * typically tries another of the IP addresses in the response.
   *
   * You can't create multivalue answer alias records.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-multivalueanswer)
   */
  public fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

  /**
   * For `ChangeResourceRecordSets` requests, the name of the record that you want to create,
   * update, or delete.
   *
   * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
   *
   * *ChangeResourceRecordSets Only*
   *
   * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
   * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain name
   * that you specify is fully qualified. This means that Route 53 treats `www.example.com` (without a
   * trailing dot) and `www.example.com.` (with a trailing dot) as identical.
   *
   * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen) and
   * how to specify internationalized domain names, see [DNS Domain Name
   * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in the
   * *Amazon Route 53 Developer Guide* .
   *
   * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
   * example, `*.example.com` . Note the following:
   *
   * * The * must replace the entire label. For example, you can't specify `*prod.example.com` or
   * `prod*.example.com` .
   * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
   * * If you include * in any position other than the leftmost label in a domain name, DNS treats
   * it as an * character (ASCII 42), not as a wildcard.
   *
   *
   * You can't use the * wildcard for resource records sets that have a type of NS.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-name)
   */
  public fun name(): String

  /**
   * *Latency-based resource record sets only:* The Amazon EC2 Region where you created the resource
   * that this resource record set refers to.
   *
   * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer, and
   * is referred to by an IP address or a DNS domain name, depending on the record type.
   *
   * When Amazon Route 53 receives a DNS query for a domain name and type for which you have created
   * latency resource record sets, Route 53 selects the latency resource record set that has the lowest
   * latency between the end user and the associated Amazon EC2 Region. Route 53 then returns the value
   * that is associated with the selected resource record set.
   *
   * Note the following:
   *
   * * You can only specify one `ResourceRecord` per latency resource record set.
   * * You can only create one latency resource record set for each Amazon EC2 Region.
   * * You aren't required to create latency resource record sets for all Amazon EC2 Regions. Route
   * 53 will choose the region with the best latency from among the regions that you create latency
   * resource record sets for.
   * * You can't create non-latency resource record sets that have the same values for the `Name`
   * and `Type` elements as latency resource record sets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-region)
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * One or more values that correspond with the value that you specified for the `Type` property.
   *
   * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
   * format for `ResourceRecords` . For information about the format of values for each record type,
   * see [Supported DNS Resource Record
   * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in the
   * *Amazon Route 53 Developer Guide* .
   *
   * Note the following:
   *
   * * You can specify more than one value for all record types except CNAME and SOA.
   * * The maximum length of a value is 4000 characters.
   * * If you're creating an alias record, omit `ResourceRecords` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-resourcerecords)
   */
  public fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

  /**
   * *Resource record sets that have a routing policy other than simple:* An identifier that
   * differentiates among multiple resource record sets that have the same combination of name and
   * type, such as multiple weighted resource record sets named acme.example.com that have a type of A.
   * In a group of resource record sets that have the same name and type, the value of `SetIdentifier`
   * must be unique for each resource record set.
   *
   * For information about routing policies, see [Choosing a Routing
   * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
   * *Amazon Route 53 Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-setidentifier)
   */
  public fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

  /**
   * The resource record cache time to live (TTL), in seconds. Note the following:.
   *
   * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
   * uses the value of `TTL` for the alias target.
   * * If you're associating this resource record set with a health check (if you're adding a
   * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so clients
   * respond quickly to changes in health status.
   * * All of the resource record sets in a group of weighted resource record sets must have the
   * same value for `TTL` .
   * * If a group of weighted resource record sets includes one or more weighted alias resource
   * record sets for which the alias target is an ELB load balancer, we recommend that you specify a
   * `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the same name
   * and type. Values other than 60 seconds (the TTL for load balancers) will change the effect of the
   * values that you specify for `Weight` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-ttl)
   */
  public fun ttl(): String? = unwrap(this).getTtl()

  /**
   * The DNS record type.
   *
   * For information about different record types and how data is encoded for them, see [Supported
   * DNS Resource Record
   * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in the
   * *Amazon Route 53 Developer Guide* .
   *
   * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
   * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
   *
   * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA` |
   * `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` |
   * `HTTPS` . When creating a group of weighted, latency, geolocation, or failover resource record
   * sets, specify the same value for all of the resource record sets in the group.
   *
   * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` | `PTR`
   * | `SPF` | `SRV` | `TXT` | `CAA` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
   *
   *
   * SPF records were formerly used to verify the identity of the sender of email messages. However,
   * we no longer recommend that you create resource record sets for which the value of `Type` is `SPF`
   * . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in Email, Version 1* ,
   * has been updated to say, "...[I]ts existence and mechanism defined in [RFC4408] have led to some
   * interoperability issues. Accordingly, its use is no longer appropriate for SPF version 1;
   * implementations are not to use it." In RFC 7208, see section 14.1, [The SPF DNS Record
   * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
   *
   *
   * Values for alias resource record sets:
   *
   * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
   * * *CloudFront distributions:* `A`
   *
   * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to
   * your distribution, one with a value of `A` and one with a value of `AAAA` .
   *
   * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
   * * *ELB load balancers:* `A` | `AAAA`
   * * *Amazon S3 buckets:* `A`
   * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
   * * *Another resource record set in this hosted zone:* Specify the type of the resource record
   * set that you're creating the alias for. All values are supported except `NS` and `SOA` .
   *
   *
   * If you're creating an alias record that has the same name as the hosted zone (known as the zone
   * apex), you can't route traffic to a record for which the value of `Type` is `CNAME` . This is
   * because the alias record must have the same type as the record you're routing traffic to, and
   * creating a CNAME record for the zone apex isn't supported even for an alias record.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-type)
   */
  public fun type(): String

  /**
   * *Weighted resource record sets only:* Among resource record sets that have the same combination
   * of DNS name and type, a value that determines the proportion of DNS queries that Amazon Route 53
   * responds to using the current resource record set.
   *
   * Route 53 calculates the sum of the weights for the resource record sets that have the same
   * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
   * resource's weight to the total. Note the following:
   *
   * * You must specify a value for the `Weight` element for every weighted resource record set.
   * * You can only specify one `ResourceRecord` per weighted resource record set.
   * * You can't create latency, failover, or geolocation resource record sets that have the same
   * values for the `Name` and `Type` elements as weighted resource record sets.
   * * You can create a maximum of 100 weighted resource record sets that have the same values for
   * the `Name` and `Type` elements.
   * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0` for a
   * resource record set, Route 53 never responds to queries with the applicable value for that
   * resource record set. However, if you set `Weight` to `0` for all resource record sets that have
   * the same combination of DNS name and type, traffic is routed to all resources with equal
   * probability.
   *
   * The effect of setting `Weight` to `0` is different when you associate health checks with
   * weighted resource record sets. For more information, see [Options for Configuring Route 53
   * Active-Active and Active-Passive
   * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
   * in the *Amazon Route 53 Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-weight)
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [CfnRecordSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    public fun aliasTarget(aliasTarget: IResolvable)

    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    public fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty)

    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb327bf0128e3e38981f4dc1c663a8ab3fee2a6008cf4c3e2236da2aa08b153e")
    public fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty.Builder.() -> Unit)

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable)

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    public fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty)

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df621563b635c66810723726622d0bd45492a369e0ba90e7d9dc5ca6e7e2d22")
    public
        fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty.Builder.() -> Unit)

    /**
     * @param comment *Optional:* Any comments you want to include about a change batch request.
     */
    public fun comment(comment: String)

    /**
     * @param failover *Failover resource record sets only:* To configure failover, you add the
     * `Failover` element to two resource record sets.
     * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
     * other resource record set, you specify `SECONDARY` . In addition, you include the
     * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
     * for each resource record set.
     *
     * Except where noted, the following failover behaviors assume that you have included the
     * `HealthCheckId` element in both resource record sets:
     *
     * * When the primary resource record set is healthy, Route 53 responds to DNS queries with the
     * applicable value from the primary resource record set regardless of the health of the secondary
     * resource record set.
     * * When the primary resource record set is unhealthy and the secondary resource record set is
     * healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource
     * record set.
     * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with
     * the applicable value from the primary resource record set regardless of the health of the
     * primary resource record set.
     * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
     * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
     * applicable value from the secondary resource record set. This is true regardless of the health
     * of the associated endpoint.
     *
     * You can't create non-failover resource record sets that have the same values for the `Name`
     * and `Type` elements as failover resource record sets.
     *
     * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
     * element and set the value to true.
     *
     * For more information about configuring failover for Route 53, see the following topics in the
     * *Amazon Route 53 Developer Guide* :
     *
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     */
    public fun failover(failover: String)

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    public fun geoLocation(geoLocation: IResolvable)

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    public fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty)

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f772b414cb62285a4a18ecc8252008abaa66d492043f2d3deec1571822097946")
    public fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty.Builder.() -> Unit)

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    public fun geoProximityLocation(geoProximityLocation: IResolvable)

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    public fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty)

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1284365c9ef9d93d47bd952bf53e2aa6d678f2892426e9470b9340f2213d7a13")
    public
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty.Builder.() -> Unit)

    /**
     * @param healthCheckId If you want Amazon Route 53 to return this resource record set in
     * response to a DNS query only when the status of a health check is healthy, include the
     * `HealthCheckId` element and specify the ID of the applicable health check.
     * Route 53 determines whether a resource record set is healthy based on one of the following:
     *
     * * By periodically sending a request to the endpoint that is specified in the health check
     * * By aggregating the status of a specified group of health checks (calculated health checks)
     * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *
     *
     * Route 53 doesn't check the health of the endpoint that is specified in the resource record
     * set, for example, the endpoint specified by the IP address in the `Value` element. When you add
     * a `HealthCheckId` element to a resource record set, Route 53 checks the health of the endpoint
     * that you specified in the health check.
     *
     *
     * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
     *
     * * [How Amazon Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * *When to Specify HealthCheckId*
     *
     * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
     * or more resource record sets to respond to a DNS query, and you want Route 53 to base the choice
     * in part on the status of a health check. Configuring health checks makes sense only in the
     * following configurations:
     *
     * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A) and you specify health check IDs for
     * all the resource record sets.
     *
     * If the health check status for a resource record set is healthy, Route 53 includes the record
     * among the records that it responds to DNS queries with.
     *
     * If the health check status for a resource record set is unhealthy, Route 53 stops responding
     * to DNS queries using the value for that resource record set.
     *
     * If the health check status for all resource record sets in the group is unhealthy, Route 53
     * considers all resource record sets in the group healthy and responds to DNS queries accordingly.
     *
     * * *Alias resource record sets* : You specify the following settings:
     * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A).
     * * You configure the alias resource record set to route traffic to a non-alias resource record
     * set in the same hosted zone.
     * * You specify a health check ID for the non-alias resource record set.
     *
     * If the health check status is healthy, Route 53 considers the alias resource record set to be
     * healthy and includes the alias record among the records that it responds to DNS queries with.
     *
     * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
     * alias resource record set.
     *
     *
     * The alias resource record set can also route traffic to a *group* of non-alias resource
     * record sets that have the same routing policy, name, and type. In that configuration, associate
     * health checks with all of the resource record sets in the group of non-alias resource record
     * sets.
     *
     *
     * *Geolocation Routing*
     *
     * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
     * resource record set for the larger, associated geographic region. For example, suppose you have
     * resource record sets for a state in the United States, for the entire United States, for North
     * America, and a resource record set that has `*` for `CountryCode` is `*` , which applies to all
     * locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for
     * healthy resource record sets in the following order until it finds a resource record set for
     * which the endpoint is healthy:
     *
     * * The United States
     * * North America
     * * The default resource record set
     *
     * *Specifying the Health Check Endpoint by Domain Name*
     *
     * If your health checks specify the endpoint only by domain name, we recommend that you create
     * a separate health check for each endpoint. For example, create a health check for each `HTTP`
     * server that is serving content for `www.example.com` . For the value of
     * `FullyQualifiedDomainName` , specify the domain name of the server (such as
     * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
     *
     *
     * Health check results will be unpredictable if you do the following:
     *
     * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name of
     * a resource record set.
     * * Associate that health check with the resource record set.
     */
    public fun healthCheckId(healthCheckId: String)

    /**
     * @param hostedZoneId The ID of the hosted zone that you want to create records in.
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    public fun hostedZoneId(hostedZoneId: String)

    /**
     * @param hostedZoneName The name of the hosted zone that you want to create records in.
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an AWS::Route53::RecordSet that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the HostedZoneName. If AWS
     * CloudFormation cannot find a hosted zone with a matching domain name, or if there is more than
     * one hosted zone with the specified domain name, AWS CloudFormation will not create the stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    public fun hostedZoneName(hostedZoneName: String)

    /**
     * @param setIdentifier *Resource record sets that have a routing policy other than simple:* An
     * identifier that differentiates among multiple resource record sets that have the same
     * combination of name and type, such as multiple weighted resource record sets named
     * acme.example.com that have a type of A. In a group of resource record sets that have the same
     * name and type, the value of `SetIdentifier` must be unique for each resource record set.
     * For information about routing policies, see [Choosing a Routing
     * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
     * *Amazon Route 53 Developer Guide* .
     */
    public fun identifier(setIdentifier: String)

    /**
     * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
     * approximately randomly to multiple resources, such as web servers, create one multivalue answer
     * record for each resource and specify `true` for `MultiValueAnswer` .
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     */
    public fun multiValueAnswer(multiValueAnswer: Boolean)

    /**
     * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
     * approximately randomly to multiple resources, such as web servers, create one multivalue answer
     * record for each resource and specify `true` for `MultiValueAnswer` .
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     */
    public fun multiValueAnswer(multiValueAnswer: IResolvable)

    /**
     * @param name For `ChangeResourceRecordSets` requests, the name of the record that you want to
     * create, update, or delete. 
     * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
     *
     * *ChangeResourceRecordSets Only*
     *
     * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
     * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
     * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
     * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
     *
     * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
     * and how to specify internationalized domain names, see [DNS Domain Name
     * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
     * example, `*.example.com` . Note the following:
     *
     * * The * must replace the entire label. For example, you can't specify `*prod.example.com` or
     * `prod*.example.com` .
     * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * * If you include * in any position other than the leftmost label in a domain name, DNS treats
     * it as an * character (ASCII 42), not as a wildcard.
     *
     *
     * You can't use the * wildcard for resource records sets that have a type of NS.
     */
    public fun name(name: String)

    /**
     * @param region *Latency-based resource record sets only:* The Amazon EC2 Region where you
     * created the resource that this resource record set refers to.
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets, Route 53 selects the latency resource record set that has
     * the lowest latency between the end user and the associated Amazon EC2 Region. Route 53 then
     * returns the value that is associated with the selected resource record set.
     *
     * Note the following:
     *
     * * You can only specify one `ResourceRecord` per latency resource record set.
     * * You can only create one latency resource record set for each Amazon EC2 Region.
     * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
     * Route 53 will choose the region with the best latency from among the regions that you create
     * latency resource record sets for.
     * * You can't create non-latency resource record sets that have the same values for the `Name`
     * and `Type` elements as latency resource record sets.
     */
    public fun region(region: String)

    /**
     * @param resourceRecords One or more values that correspond with the value that you specified
     * for the `Type` property.
     * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
     * format for `ResourceRecords` . For information about the format of values for each record type,
     * see [Supported DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Note the following:
     *
     * * You can specify more than one value for all record types except CNAME and SOA.
     * * The maximum length of a value is 4000 characters.
     * * If you're creating an alias record, omit `ResourceRecords` .
     */
    public fun resourceRecords(resourceRecords: List<String>)

    /**
     * @param resourceRecords One or more values that correspond with the value that you specified
     * for the `Type` property.
     * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
     * format for `ResourceRecords` . For information about the format of values for each record type,
     * see [Supported DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Note the following:
     *
     * * You can specify more than one value for all record types except CNAME and SOA.
     * * The maximum length of a value is 4000 characters.
     * * If you're creating an alias record, omit `ResourceRecords` .
     */
    public fun resourceRecords(vararg resourceRecords: String)

    /**
     * @param ttl The resource record cache time to live (TTL), in seconds. Note the following:.
     * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
     * uses the value of `TTL` for the alias target.
     * * If you're associating this resource record set with a health check (if you're adding a
     * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so clients
     * respond quickly to changes in health status.
     * * All of the resource record sets in a group of weighted resource record sets must have the
     * same value for `TTL` .
     * * If a group of weighted resource record sets includes one or more weighted alias resource
     * record sets for which the alias target is an ELB load balancer, we recommend that you specify a
     * `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the same
     * name and type. Values other than 60 seconds (the TTL for load balancers) will change the effect
     * of the values that you specify for `Weight` .
     */
    public fun ttl(ttl: String)

    /**
     * @param type The DNS record type. 
     * For information about different record types and how data is encoded for them, see [Supported
     * DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
     * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA` |
     * `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` |
     * `HTTPS` . When creating a group of weighted, latency, geolocation, or failover resource record
     * sets, specify the same value for all of the resource record sets in the group.
     *
     * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
     * `PTR` | `SPF` | `SRV` | `TXT` | `CAA` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     *
     * SPF records were formerly used to verify the identity of the sender of email messages.
     * However, we no longer recommend that you create resource record sets for which the value of
     * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
     * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
     * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
     * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
     * 14.1, [The SPF DNS Record
     * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
     *
     *
     * Values for alias resource record sets:
     *
     * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
     * * *CloudFront distributions:* `A`
     *
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to
     * your distribution, one with a value of `A` and one with a value of `AAAA` .
     *
     * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
     * * *ELB load balancers:* `A` | `AAAA`
     * * *Amazon S3 buckets:* `A`
     * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
     * * *Another resource record set in this hosted zone:* Specify the type of the resource record
     * set that you're creating the alias for. All values are supported except `NS` and `SOA` .
     *
     *
     * If you're creating an alias record that has the same name as the hosted zone (known as the
     * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` . This
     * is because the alias record must have the same type as the record you're routing traffic to, and
     * creating a CNAME record for the zone apex isn't supported even for an alias record.
     */
    public fun type(type: String)

    /**
     * @param weight *Weighted resource record sets only:* Among resource record sets that have the
     * same combination of DNS name and type, a value that determines the proportion of DNS queries
     * that Amazon Route 53 responds to using the current resource record set.
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     *
     * * You must specify a value for the `Weight` element for every weighted resource record set.
     * * You can only specify one `ResourceRecord` per weighted resource record set.
     * * You can't create latency, failover, or geolocation resource record sets that have the same
     * values for the `Name` and `Type` elements as weighted resource record sets.
     * * You can create a maximum of 100 weighted resource record sets that have the same values for
     * the `Name` and `Type` elements.
     * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0` for
     * a resource record set, Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set `Weight` to `0` for all resource record sets that have
     * the same combination of DNS name and type, traffic is routed to all resources with equal
     * probability.
     *
     * The effect of setting `Weight` to `0` is different when you associate health checks with
     * weighted resource record sets. For more information, see [Options for Configuring Route 53
     * Active-Active and Active-Passive
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetProps.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetProps.builder()

    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    override fun aliasTarget(aliasTarget: IResolvable) {
      cdkBuilder.aliasTarget(aliasTarget.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    override fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty) {
      cdkBuilder.aliasTarget(aliasTarget.let(CfnRecordSet.AliasTargetProperty.Companion::unwrap))
    }

    /**
     * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
     * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb327bf0128e3e38981f4dc1c663a8ab3fee2a6008cf4c3e2236da2aa08b153e")
    override fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty.Builder.() -> Unit): Unit
        = aliasTarget(CfnRecordSet.AliasTargetProperty(aliasTarget))

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    override fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    override fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(CfnRecordSet.CidrRoutingConfigProperty.Companion::unwrap))
    }

    /**
     * @param cidrRoutingConfig The object that is specified in resource record set object when you
     * are linking a resource record set to a CIDR location.
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df621563b635c66810723726622d0bd45492a369e0ba90e7d9dc5ca6e7e2d22")
    override
        fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty.Builder.() -> Unit):
        Unit = cidrRoutingConfig(CfnRecordSet.CidrRoutingConfigProperty(cidrRoutingConfig))

    /**
     * @param comment *Optional:* Any comments you want to include about a change batch request.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param failover *Failover resource record sets only:* To configure failover, you add the
     * `Failover` element to two resource record sets.
     * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
     * other resource record set, you specify `SECONDARY` . In addition, you include the
     * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
     * for each resource record set.
     *
     * Except where noted, the following failover behaviors assume that you have included the
     * `HealthCheckId` element in both resource record sets:
     *
     * * When the primary resource record set is healthy, Route 53 responds to DNS queries with the
     * applicable value from the primary resource record set regardless of the health of the secondary
     * resource record set.
     * * When the primary resource record set is unhealthy and the secondary resource record set is
     * healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource
     * record set.
     * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with
     * the applicable value from the primary resource record set regardless of the health of the
     * primary resource record set.
     * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
     * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
     * applicable value from the secondary resource record set. This is true regardless of the health
     * of the associated endpoint.
     *
     * You can't create non-failover resource record sets that have the same values for the `Name`
     * and `Type` elements as failover resource record sets.
     *
     * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
     * element and set the value to true.
     *
     * For more information about configuring failover for Route 53, see the following topics in the
     * *Amazon Route 53 Developer Guide* :
     *
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     */
    override fun failover(failover: String) {
      cdkBuilder.failover(failover)
    }

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    override fun geoLocation(geoLocation: IResolvable) {
      cdkBuilder.geoLocation(geoLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    override fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty) {
      cdkBuilder.geoLocation(geoLocation.let(CfnRecordSet.GeoLocationProperty.Companion::unwrap))
    }

    /**
     * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
     * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the query.
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f772b414cb62285a4a18ecc8252008abaa66d492043f2d3deec1571822097946")
    override fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty.Builder.() -> Unit): Unit
        = geoLocation(CfnRecordSet.GeoLocationProperty(geoLocation))

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    override fun geoProximityLocation(geoProximityLocation: IResolvable) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    override
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(CfnRecordSet.GeoProximityLocationProperty.Companion::unwrap))
    }

    /**
     * @param geoProximityLocation *GeoproximityLocation resource record sets only:* A complex type
     * that lets you control how Route 53 responds to DNS queries based on the geographic origin of the
     * query and your resources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1284365c9ef9d93d47bd952bf53e2aa6d678f2892426e9470b9340f2213d7a13")
    override
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty.Builder.() -> Unit):
        Unit = geoProximityLocation(CfnRecordSet.GeoProximityLocationProperty(geoProximityLocation))

    /**
     * @param healthCheckId If you want Amazon Route 53 to return this resource record set in
     * response to a DNS query only when the status of a health check is healthy, include the
     * `HealthCheckId` element and specify the ID of the applicable health check.
     * Route 53 determines whether a resource record set is healthy based on one of the following:
     *
     * * By periodically sending a request to the endpoint that is specified in the health check
     * * By aggregating the status of a specified group of health checks (calculated health checks)
     * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *
     *
     * Route 53 doesn't check the health of the endpoint that is specified in the resource record
     * set, for example, the endpoint specified by the IP address in the `Value` element. When you add
     * a `HealthCheckId` element to a resource record set, Route 53 checks the health of the endpoint
     * that you specified in the health check.
     *
     *
     * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
     *
     * * [How Amazon Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * *When to Specify HealthCheckId*
     *
     * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
     * or more resource record sets to respond to a DNS query, and you want Route 53 to base the choice
     * in part on the status of a health check. Configuring health checks makes sense only in the
     * following configurations:
     *
     * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A) and you specify health check IDs for
     * all the resource record sets.
     *
     * If the health check status for a resource record set is healthy, Route 53 includes the record
     * among the records that it responds to DNS queries with.
     *
     * If the health check status for a resource record set is unhealthy, Route 53 stops responding
     * to DNS queries using the value for that resource record set.
     *
     * If the health check status for all resource record sets in the group is unhealthy, Route 53
     * considers all resource record sets in the group healthy and responds to DNS queries accordingly.
     *
     * * *Alias resource record sets* : You specify the following settings:
     * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A).
     * * You configure the alias resource record set to route traffic to a non-alias resource record
     * set in the same hosted zone.
     * * You specify a health check ID for the non-alias resource record set.
     *
     * If the health check status is healthy, Route 53 considers the alias resource record set to be
     * healthy and includes the alias record among the records that it responds to DNS queries with.
     *
     * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
     * alias resource record set.
     *
     *
     * The alias resource record set can also route traffic to a *group* of non-alias resource
     * record sets that have the same routing policy, name, and type. In that configuration, associate
     * health checks with all of the resource record sets in the group of non-alias resource record
     * sets.
     *
     *
     * *Geolocation Routing*
     *
     * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
     * resource record set for the larger, associated geographic region. For example, suppose you have
     * resource record sets for a state in the United States, for the entire United States, for North
     * America, and a resource record set that has `*` for `CountryCode` is `*` , which applies to all
     * locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for
     * healthy resource record sets in the following order until it finds a resource record set for
     * which the endpoint is healthy:
     *
     * * The United States
     * * North America
     * * The default resource record set
     *
     * *Specifying the Health Check Endpoint by Domain Name*
     *
     * If your health checks specify the endpoint only by domain name, we recommend that you create
     * a separate health check for each endpoint. For example, create a health check for each `HTTP`
     * server that is serving content for `www.example.com` . For the value of
     * `FullyQualifiedDomainName` , specify the domain name of the server (such as
     * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
     *
     *
     * Health check results will be unpredictable if you do the following:
     *
     * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name of
     * a resource record set.
     * * Associate that health check with the resource record set.
     */
    override fun healthCheckId(healthCheckId: String) {
      cdkBuilder.healthCheckId(healthCheckId)
    }

    /**
     * @param hostedZoneId The ID of the hosted zone that you want to create records in.
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /**
     * @param hostedZoneName The name of the hosted zone that you want to create records in.
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an AWS::Route53::RecordSet that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the HostedZoneName. If AWS
     * CloudFormation cannot find a hosted zone with a matching domain name, or if there is more than
     * one hosted zone with the specified domain name, AWS CloudFormation will not create the stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    /**
     * @param setIdentifier *Resource record sets that have a routing policy other than simple:* An
     * identifier that differentiates among multiple resource record sets that have the same
     * combination of name and type, such as multiple weighted resource record sets named
     * acme.example.com that have a type of A. In a group of resource record sets that have the same
     * name and type, the value of `SetIdentifier` must be unique for each resource record set.
     * For information about routing policies, see [Choosing a Routing
     * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
     * *Amazon Route 53 Developer Guide* .
     */
    override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    /**
     * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
     * approximately randomly to multiple resources, such as web servers, create one multivalue answer
     * record for each resource and specify `true` for `MultiValueAnswer` .
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     */
    override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    /**
     * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
     * approximately randomly to multiple resources, such as web servers, create one multivalue answer
     * record for each resource and specify `true` for `MultiValueAnswer` .
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     */
    override fun multiValueAnswer(multiValueAnswer: IResolvable) {
      cdkBuilder.multiValueAnswer(multiValueAnswer.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name For `ChangeResourceRecordSets` requests, the name of the record that you want to
     * create, update, or delete. 
     * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
     *
     * *ChangeResourceRecordSets Only*
     *
     * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
     * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
     * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
     * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
     *
     * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
     * and how to specify internationalized domain names, see [DNS Domain Name
     * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
     * example, `*.example.com` . Note the following:
     *
     * * The * must replace the entire label. For example, you can't specify `*prod.example.com` or
     * `prod*.example.com` .
     * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * * If you include * in any position other than the leftmost label in a domain name, DNS treats
     * it as an * character (ASCII 42), not as a wildcard.
     *
     *
     * You can't use the * wildcard for resource records sets that have a type of NS.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param region *Latency-based resource record sets only:* The Amazon EC2 Region where you
     * created the resource that this resource record set refers to.
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets, Route 53 selects the latency resource record set that has
     * the lowest latency between the end user and the associated Amazon EC2 Region. Route 53 then
     * returns the value that is associated with the selected resource record set.
     *
     * Note the following:
     *
     * * You can only specify one `ResourceRecord` per latency resource record set.
     * * You can only create one latency resource record set for each Amazon EC2 Region.
     * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
     * Route 53 will choose the region with the best latency from among the regions that you create
     * latency resource record sets for.
     * * You can't create non-latency resource record sets that have the same values for the `Name`
     * and `Type` elements as latency resource record sets.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param resourceRecords One or more values that correspond with the value that you specified
     * for the `Type` property.
     * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
     * format for `ResourceRecords` . For information about the format of values for each record type,
     * see [Supported DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Note the following:
     *
     * * You can specify more than one value for all record types except CNAME and SOA.
     * * The maximum length of a value is 4000 characters.
     * * If you're creating an alias record, omit `ResourceRecords` .
     */
    override fun resourceRecords(resourceRecords: List<String>) {
      cdkBuilder.resourceRecords(resourceRecords)
    }

    /**
     * @param resourceRecords One or more values that correspond with the value that you specified
     * for the `Type` property.
     * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
     * format for `ResourceRecords` . For information about the format of values for each record type,
     * see [Supported DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Note the following:
     *
     * * You can specify more than one value for all record types except CNAME and SOA.
     * * The maximum length of a value is 4000 characters.
     * * If you're creating an alias record, omit `ResourceRecords` .
     */
    override fun resourceRecords(vararg resourceRecords: String): Unit =
        resourceRecords(resourceRecords.toList())

    /**
     * @param ttl The resource record cache time to live (TTL), in seconds. Note the following:.
     * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
     * uses the value of `TTL` for the alias target.
     * * If you're associating this resource record set with a health check (if you're adding a
     * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so clients
     * respond quickly to changes in health status.
     * * All of the resource record sets in a group of weighted resource record sets must have the
     * same value for `TTL` .
     * * If a group of weighted resource record sets includes one or more weighted alias resource
     * record sets for which the alias target is an ELB load balancer, we recommend that you specify a
     * `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the same
     * name and type. Values other than 60 seconds (the TTL for load balancers) will change the effect
     * of the values that you specify for `Weight` .
     */
    override fun ttl(ttl: String) {
      cdkBuilder.ttl(ttl)
    }

    /**
     * @param type The DNS record type. 
     * For information about different record types and how data is encoded for them, see [Supported
     * DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
     * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA` |
     * `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` |
     * `HTTPS` . When creating a group of weighted, latency, geolocation, or failover resource record
     * sets, specify the same value for all of the resource record sets in the group.
     *
     * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
     * `PTR` | `SPF` | `SRV` | `TXT` | `CAA` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     *
     * SPF records were formerly used to verify the identity of the sender of email messages.
     * However, we no longer recommend that you create resource record sets for which the value of
     * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
     * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
     * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
     * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
     * 14.1, [The SPF DNS Record
     * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
     *
     *
     * Values for alias resource record sets:
     *
     * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
     * * *CloudFront distributions:* `A`
     *
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to
     * your distribution, one with a value of `A` and one with a value of `AAAA` .
     *
     * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
     * * *ELB load balancers:* `A` | `AAAA`
     * * *Amazon S3 buckets:* `A`
     * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
     * * *Another resource record set in this hosted zone:* Specify the type of the resource record
     * set that you're creating the alias for. All values are supported except `NS` and `SOA` .
     *
     *
     * If you're creating an alias record that has the same name as the hosted zone (known as the
     * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` . This
     * is because the alias record must have the same type as the record you're routing traffic to, and
     * creating a CNAME record for the zone apex isn't supported even for an alias record.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param weight *Weighted resource record sets only:* Among resource record sets that have the
     * same combination of DNS name and type, a value that determines the proportion of DNS queries
     * that Amazon Route 53 responds to using the current resource record set.
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     *
     * * You must specify a value for the `Weight` element for every weighted resource record set.
     * * You can only specify one `ResourceRecord` per weighted resource record set.
     * * You can't create latency, failover, or geolocation resource record sets that have the same
     * values for the `Name` and `Type` elements as weighted resource record sets.
     * * You can create a maximum of 100 weighted resource record sets that have the same values for
     * the `Name` and `Type` elements.
     * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0` for
     * a resource record set, Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set `Weight` to `0` for all resource record sets that have
     * the same combination of DNS name and type, traffic is routed to all resources with equal
     * probability.
     *
     * The effect of setting `Weight` to `0` is different when you associate health checks with
     * weighted resource record sets. For more information, see [Options for Configuring Route 53
     * Active-Active and Active-Passive
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
     * in the *Amazon Route 53 Developer Guide* .
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetProps,
  ) : CdkObject(cdkObject),
      CfnRecordSetProps {
    /**
     * *Alias resource record sets only:* Information about the AWS resource, such as a CloudFront
     * distribution or an Amazon S3 bucket, that you want to route traffic to.
     *
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-aliastarget)
     */
    override fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

    /**
     * The object that is specified in resource record set object when you are linking a resource
     * record set to a CIDR location.
     *
     * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
     * `CollectionId` is still required for default record.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-cidrroutingconfig)
     */
    override fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

    /**
     * *Optional:* Any comments you want to include about a change batch request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-comment)
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * *Failover resource record sets only:* To configure failover, you add the `Failover` element
     * to two resource record sets.
     *
     * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
     * other resource record set, you specify `SECONDARY` . In addition, you include the
     * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
     * for each resource record set.
     *
     * Except where noted, the following failover behaviors assume that you have included the
     * `HealthCheckId` element in both resource record sets:
     *
     * * When the primary resource record set is healthy, Route 53 responds to DNS queries with the
     * applicable value from the primary resource record set regardless of the health of the secondary
     * resource record set.
     * * When the primary resource record set is unhealthy and the secondary resource record set is
     * healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource
     * record set.
     * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with
     * the applicable value from the primary resource record set regardless of the health of the
     * primary resource record set.
     * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
     * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
     * applicable value from the secondary resource record set. This is true regardless of the health
     * of the associated endpoint.
     *
     * You can't create non-failover resource record sets that have the same values for the `Name`
     * and `Type` elements as failover resource record sets.
     *
     * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
     * element and set the value to true.
     *
     * For more information about configuring failover for Route 53, see the following topics in the
     * *Amazon Route 53 Developer Guide* :
     *
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-failover)
     */
    override fun failover(): String? = unwrap(this).getFailover()

    /**
     * *Geolocation resource record sets only:* A complex type that lets you control how Amazon
     * Route 53 responds to DNS queries based on the geographic origin of the query.
     *
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-geolocation)
     */
    override fun geoLocation(): Any? = unwrap(this).getGeoLocation()

    /**
     * *GeoproximityLocation resource record sets only:* A complex type that lets you control how
     * Route 53 responds to DNS queries based on the geographic origin of the query and your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-geoproximitylocation)
     */
    override fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

    /**
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query
     * only when the status of a health check is healthy, include the `HealthCheckId` element and
     * specify the ID of the applicable health check.
     *
     * Route 53 determines whether a resource record set is healthy based on one of the following:
     *
     * * By periodically sending a request to the endpoint that is specified in the health check
     * * By aggregating the status of a specified group of health checks (calculated health checks)
     * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *
     *
     * Route 53 doesn't check the health of the endpoint that is specified in the resource record
     * set, for example, the endpoint specified by the IP address in the `Value` element. When you add
     * a `HealthCheckId` element to a resource record set, Route 53 checks the health of the endpoint
     * that you specified in the health check.
     *
     *
     * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
     *
     * * [How Amazon Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * *When to Specify HealthCheckId*
     *
     * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
     * or more resource record sets to respond to a DNS query, and you want Route 53 to base the choice
     * in part on the status of a health check. Configuring health checks makes sense only in the
     * following configurations:
     *
     * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A) and you specify health check IDs for
     * all the resource record sets.
     *
     * If the health check status for a resource record set is healthy, Route 53 includes the record
     * among the records that it responds to DNS queries with.
     *
     * If the health check status for a resource record set is unhealthy, Route 53 stops responding
     * to DNS queries using the value for that resource record set.
     *
     * If the health check status for all resource record sets in the group is unhealthy, Route 53
     * considers all resource record sets in the group healthy and responds to DNS queries accordingly.
     *
     * * *Alias resource record sets* : You specify the following settings:
     * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A).
     * * You configure the alias resource record set to route traffic to a non-alias resource record
     * set in the same hosted zone.
     * * You specify a health check ID for the non-alias resource record set.
     *
     * If the health check status is healthy, Route 53 considers the alias resource record set to be
     * healthy and includes the alias record among the records that it responds to DNS queries with.
     *
     * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
     * alias resource record set.
     *
     *
     * The alias resource record set can also route traffic to a *group* of non-alias resource
     * record sets that have the same routing policy, name, and type. In that configuration, associate
     * health checks with all of the resource record sets in the group of non-alias resource record
     * sets.
     *
     *
     * *Geolocation Routing*
     *
     * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
     * resource record set for the larger, associated geographic region. For example, suppose you have
     * resource record sets for a state in the United States, for the entire United States, for North
     * America, and a resource record set that has `*` for `CountryCode` is `*` , which applies to all
     * locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for
     * healthy resource record sets in the following order until it finds a resource record set for
     * which the endpoint is healthy:
     *
     * * The United States
     * * North America
     * * The default resource record set
     *
     * *Specifying the Health Check Endpoint by Domain Name*
     *
     * If your health checks specify the endpoint only by domain name, we recommend that you create
     * a separate health check for each endpoint. For example, create a health check for each `HTTP`
     * server that is serving content for `www.example.com` . For the value of
     * `FullyQualifiedDomainName` , specify the domain name of the server (such as
     * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
     *
     *
     * Health check results will be unpredictable if you do the following:
     *
     * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name of
     * a resource record set.
     * * Associate that health check with the resource record set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-healthcheckid)
     */
    override fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

    /**
     * The ID of the hosted zone that you want to create records in.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-hostedzoneid)
     */
    override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * The name of the hosted zone that you want to create records in.
     *
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an AWS::Route53::RecordSet that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the HostedZoneName. If AWS
     * CloudFormation cannot find a hosted zone with a matching domain name, or if there is more than
     * one hosted zone with the specified domain name, AWS CloudFormation will not create the stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-hostedzonename)
     */
    override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    /**
     * *Multivalue answer resource record sets only* : To route traffic approximately randomly to
     * multiple resources, such as web servers, create one multivalue answer record for each resource
     * and specify `true` for `MultiValueAnswer` .
     *
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-multivalueanswer)
     */
    override fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

    /**
     * For `ChangeResourceRecordSets` requests, the name of the record that you want to create,
     * update, or delete.
     *
     * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
     *
     * *ChangeResourceRecordSets Only*
     *
     * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
     * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
     * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
     * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
     *
     * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
     * and how to specify internationalized domain names, see [DNS Domain Name
     * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
     * example, `*.example.com` . Note the following:
     *
     * * The * must replace the entire label. For example, you can't specify `*prod.example.com` or
     * `prod*.example.com` .
     * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * * If you include * in any position other than the leftmost label in a domain name, DNS treats
     * it as an * character (ASCII 42), not as a wildcard.
     *
     *
     * You can't use the * wildcard for resource records sets that have a type of NS.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * *Latency-based resource record sets only:* The Amazon EC2 Region where you created the
     * resource that this resource record set refers to.
     *
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets, Route 53 selects the latency resource record set that has
     * the lowest latency between the end user and the associated Amazon EC2 Region. Route 53 then
     * returns the value that is associated with the selected resource record set.
     *
     * Note the following:
     *
     * * You can only specify one `ResourceRecord` per latency resource record set.
     * * You can only create one latency resource record set for each Amazon EC2 Region.
     * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
     * Route 53 will choose the region with the best latency from among the regions that you create
     * latency resource record sets for.
     * * You can't create non-latency resource record sets that have the same values for the `Name`
     * and `Type` elements as latency resource record sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-region)
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * One or more values that correspond with the value that you specified for the `Type` property.
     *
     * For example, if you specified `A` for `Type` , you specify one or more IP addresses in IPv4
     * format for `ResourceRecords` . For information about the format of values for each record type,
     * see [Supported DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Note the following:
     *
     * * You can specify more than one value for all record types except CNAME and SOA.
     * * The maximum length of a value is 4000 characters.
     * * If you're creating an alias record, omit `ResourceRecords` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-resourcerecords)
     */
    override fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

    /**
     * *Resource record sets that have a routing policy other than simple:* An identifier that
     * differentiates among multiple resource record sets that have the same combination of name and
     * type, such as multiple weighted resource record sets named acme.example.com that have a type of
     * A. In a group of resource record sets that have the same name and type, the value of
     * `SetIdentifier` must be unique for each resource record set.
     *
     * For information about routing policies, see [Choosing a Routing
     * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-setidentifier)
     */
    override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

    /**
     * The resource record cache time to live (TTL), in seconds. Note the following:.
     *
     * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
     * uses the value of `TTL` for the alias target.
     * * If you're associating this resource record set with a health check (if you're adding a
     * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so clients
     * respond quickly to changes in health status.
     * * All of the resource record sets in a group of weighted resource record sets must have the
     * same value for `TTL` .
     * * If a group of weighted resource record sets includes one or more weighted alias resource
     * record sets for which the alias target is an ELB load balancer, we recommend that you specify a
     * `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the same
     * name and type. Values other than 60 seconds (the TTL for load balancers) will change the effect
     * of the values that you specify for `Weight` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-ttl)
     */
    override fun ttl(): String? = unwrap(this).getTtl()

    /**
     * The DNS record type.
     *
     * For information about different record types and how data is encoded for them, see [Supported
     * DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
     * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA` |
     * `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` | `TLSA` | `SSHFP` | `SVCB` |
     * `HTTPS` . When creating a group of weighted, latency, geolocation, or failover resource record
     * sets, specify the same value for all of the resource record sets in the group.
     *
     * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
     * `PTR` | `SPF` | `SRV` | `TXT` | `CAA` | `TLSA` | `SSHFP` | `SVCB` | `HTTPS`
     *
     *
     * SPF records were formerly used to verify the identity of the sender of email messages.
     * However, we no longer recommend that you create resource record sets for which the value of
     * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
     * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
     * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
     * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
     * 14.1, [The SPF DNS Record
     * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
     *
     *
     * Values for alias resource record sets:
     *
     * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
     * * *CloudFront distributions:* `A`
     *
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to
     * your distribution, one with a value of `A` and one with a value of `AAAA` .
     *
     * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
     * * *ELB load balancers:* `A` | `AAAA`
     * * *Amazon S3 buckets:* `A`
     * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
     * * *Another resource record set in this hosted zone:* Specify the type of the resource record
     * set that you're creating the alias for. All values are supported except `NS` and `SOA` .
     *
     *
     * If you're creating an alias record that has the same name as the hosted zone (known as the
     * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` . This
     * is because the alias record must have the same type as the record you're routing traffic to, and
     * creating a CNAME record for the zone apex isn't supported even for an alias record.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * *Weighted resource record sets only:* Among resource record sets that have the same
     * combination of DNS name and type, a value that determines the proportion of DNS queries that
     * Amazon Route 53 responds to using the current resource record set.
     *
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     *
     * * You must specify a value for the `Weight` element for every weighted resource record set.
     * * You can only specify one `ResourceRecord` per weighted resource record set.
     * * You can't create latency, failover, or geolocation resource record sets that have the same
     * values for the `Name` and `Type` elements as weighted resource record sets.
     * * You can create a maximum of 100 weighted resource record sets that have the same values for
     * the `Name` and `Type` elements.
     * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0` for
     * a resource record set, Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set `Weight` to `0` for all resource record sets that have
     * the same combination of DNS name and type, traffic is routed to all resources with equal
     * probability.
     *
     * The effect of setting `Weight` to `0` is different when you associate health checks with
     * weighted resource record sets. For more information, see [Options for Configuring Route 53
     * Active-Active and Active-Passive
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-weight)
     */
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetProps):
        CfnRecordSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRecordSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetProps):
        software.amazon.awscdk.services.route53.CfnRecordSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.CfnRecordSetProps
  }
}
