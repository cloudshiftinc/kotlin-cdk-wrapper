@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A DNS CNAME record.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * // hosted zone and route53 features
 * String hostedZoneId;
 * String zoneName = "example.com";
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("myApi")
 * .definition(Definition.fromSchema(schema))
 * .domainName(DomainOptions.builder()
 * .certificate(certificate)
 * .domainName(myDomainName)
 * .build())
 * .build();
 * // hosted zone for adding appsync domain
 * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
 * HostedZoneAttributes.builder()
 * .hostedZoneId(hostedZoneId)
 * .zoneName(zoneName)
 * .build());
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * CnameRecord.Builder.create(this, "CnameApiRecord")
 * .recordName("api")
 * .zone(zone)
 * .domainName(api.getAppSyncDomainName())
 * .build();
 * ```
 */
public open class CnameRecord(
  cdkObject: software.amazon.awscdk.services.route53.CnameRecord,
) : RecordSet(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CnameRecordProps,
  ) :
      this(software.amazon.awscdk.services.route53.CnameRecord(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CnameRecordProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CnameRecordProps.Builder.() -> Unit,
  ) : this(scope, id, CnameRecordProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CnameRecord].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment to add on the record.
     *
     * Default: no comment
     *
     * @param comment A comment to add on the record. 
     */
    public fun comment(comment: String)

    /**
     * Whether to delete the same record set in the hosted zone if it already exists (dangerous!).
     *
     * This allows to deploy a new record set while minimizing the downtime because the
     * new record set will be created immediately after the existing one is deleted. It
     * also avoids "manual" actions to delete existing record sets.
     *
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
     * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
     * will delete the record!
     *
     *
     * Default: false
     *
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     * exists (dangerous!). 
     */
    public fun deleteExisting(deleteExisting: Boolean)

    /**
     * The domain name of the target that this record should point to.
     *
     * @param domainName The domain name of the target that this record should point to. 
     */
    public fun domainName(domainName: String)

    /**
     * The geographical origin for this record to return DNS records based on the user's location.
     *
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location. 
     */
    public fun geoLocation(geoLocation: GeoLocation)

    /**
     * The health check to associate with the record set.
     *
     * Route53 will return this record set in response to DNS queries only if the health check is
     * passing.
     *
     * Default: - No health check configured
     *
     * @param healthCheck The health check to associate with the record set. 
     */
    public fun healthCheck(healthCheck: IHealthCheck)

    /**
     * A string used to distinguish between different records with the same combination of DNS name
     * and type.
     *
     * It can only be set when either weight or geoLocation is defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     *
     * Default: - Auto generated string
     *
     * @param setIdentifier A string used to distinguish between different records with the same
     * combination of DNS name and type. 
     */
    public fun identifier(setIdentifier: String)

    /**
     * Whether to return multiple values, such as IP addresses for your web servers, in response to
     * DNS queries.
     *
     * Default: false
     *
     * @param multiValueAnswer Whether to return multiple values, such as IP addresses for your web
     * servers, in response to DNS queries. 
     */
    public fun multiValueAnswer(multiValueAnswer: Boolean)

    /**
     * The subdomain name for this record. This should be relative to the zone root name.
     *
     * For example, if you want to create a record for acme.example.com, specify
     * "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a
     * ".". For example, "acme.example.com.".
     *
     * Default: zone root
     *
     * @param recordName The subdomain name for this record. This should be relative to the zone
     * root name. 
     */
    public fun recordName(recordName: String)

    /**
     * The Amazon EC2 Region where you created the resource that this resource record set refers to.
     *
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets,
     * Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region.
     * Route 53 then returns the value that is associated with the selected resource record set.
     *
     * Default: - Do not set latency based routing
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-region)
     * @param region The Amazon EC2 Region where you created the resource that this resource record
     * set refers to. 
     */
    public fun region(region: String)

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.minutes(30)
     *
     * @param ttl The resource record cache time to live (TTL). 
     */
    public fun ttl(ttl: Duration)

    /**
     * Among resource record sets that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to using the current
     * resource record set.
     *
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type.
     * Route 53 then responds to queries based on the ratio of a resource's weight to the total.
     *
     * This value can be a number between 0 and 255.
     *
     * Default: - Do not set weighted routing
     *
     * [Documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-weighted.html)
     * @param weight Among resource record sets that have the same combination of DNS name and type,
     * a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. 
     */
    public fun weight(weight: Number)

    /**
     * The hosted zone in which to define the new record.
     *
     * @param zone The hosted zone in which to define the new record. 
     */
    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CnameRecord.Builder =
        software.amazon.awscdk.services.route53.CnameRecord.Builder.create(scope, id)

    /**
     * A comment to add on the record.
     *
     * Default: no comment
     *
     * @param comment A comment to add on the record. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Whether to delete the same record set in the hosted zone if it already exists (dangerous!).
     *
     * This allows to deploy a new record set while minimizing the downtime because the
     * new record set will be created immediately after the existing one is deleted. It
     * also avoids "manual" actions to delete existing record sets.
     *
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
     * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
     * will delete the record!
     *
     *
     * Default: false
     *
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     * exists (dangerous!). 
     */
    override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
    }

    /**
     * The domain name of the target that this record should point to.
     *
     * @param domainName The domain name of the target that this record should point to. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The geographical origin for this record to return DNS records based on the user's location.
     *
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location. 
     */
    override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation.Companion::unwrap))
    }

    /**
     * The health check to associate with the record set.
     *
     * Route53 will return this record set in response to DNS queries only if the health check is
     * passing.
     *
     * Default: - No health check configured
     *
     * @param healthCheck The health check to associate with the record set. 
     */
    override fun healthCheck(healthCheck: IHealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(IHealthCheck.Companion::unwrap))
    }

    /**
     * A string used to distinguish between different records with the same combination of DNS name
     * and type.
     *
     * It can only be set when either weight or geoLocation is defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     *
     * Default: - Auto generated string
     *
     * @param setIdentifier A string used to distinguish between different records with the same
     * combination of DNS name and type. 
     */
    override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    /**
     * Whether to return multiple values, such as IP addresses for your web servers, in response to
     * DNS queries.
     *
     * Default: false
     *
     * @param multiValueAnswer Whether to return multiple values, such as IP addresses for your web
     * servers, in response to DNS queries. 
     */
    override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    /**
     * The subdomain name for this record. This should be relative to the zone root name.
     *
     * For example, if you want to create a record for acme.example.com, specify
     * "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a
     * ".". For example, "acme.example.com.".
     *
     * Default: zone root
     *
     * @param recordName The subdomain name for this record. This should be relative to the zone
     * root name. 
     */
    override fun recordName(recordName: String) {
      cdkBuilder.recordName(recordName)
    }

    /**
     * The Amazon EC2 Region where you created the resource that this resource record set refers to.
     *
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets,
     * Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region.
     * Route 53 then returns the value that is associated with the selected resource record set.
     *
     * Default: - Do not set latency based routing
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordset.html#cfn-route53-recordset-region)
     * @param region The Amazon EC2 Region where you created the resource that this resource record
     * set refers to. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.minutes(30)
     *
     * @param ttl The resource record cache time to live (TTL). 
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration.Companion::unwrap))
    }

    /**
     * Among resource record sets that have the same combination of DNS name and type, a value that
     * determines the proportion of DNS queries that Amazon Route 53 responds to using the current
     * resource record set.
     *
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type.
     * Route 53 then responds to queries based on the ratio of a resource's weight to the total.
     *
     * This value can be a number between 0 and 255.
     *
     * Default: - Do not set weighted routing
     *
     * [Documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-weighted.html)
     * @param weight Among resource record sets that have the same combination of DNS name and type,
     * a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set. 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    /**
     * The hosted zone in which to define the new record.
     *
     * @param zone The hosted zone in which to define the new record. 
     */
    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.CnameRecord = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CnameRecord {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CnameRecord(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CnameRecord): CnameRecord =
        CnameRecord(cdkObject)

    internal fun unwrap(wrapped: CnameRecord): software.amazon.awscdk.services.route53.CnameRecord =
        wrapped.cdkObject as software.amazon.awscdk.services.route53.CnameRecord
  }
}
