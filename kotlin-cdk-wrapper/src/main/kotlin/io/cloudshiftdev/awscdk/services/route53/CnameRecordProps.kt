@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a CnameRecord.
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
public interface CnameRecordProps : RecordSetOptions {
  /**
   * The domain name of the target that this record should point to.
   */
  public fun domainName(): String

  /**
   * A builder for [CnameRecordProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to add on the record.
     */
    public fun comment(comment: String)

    /**
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     * exists (dangerous!).
     * This allows to deploy a new record set while minimizing the downtime because the
     * new record set will be created immediately after the existing one is deleted. It
     * also avoids "manual" actions to delete existing record sets.
     *
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
     * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
     * will delete the record!
     */
    public fun deleteExisting(deleteExisting: Boolean)

    /**
     * @param domainName The domain name of the target that this record should point to. 
     */
    public fun domainName(domainName: String)

    /**
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location.
     */
    public fun geoLocation(geoLocation: GeoLocation)

    /**
     * @param healthCheck The health check to associate with the record set.
     * Route53 will return this record set in response to DNS queries only if the health check is
     * passing.
     */
    public fun healthCheck(healthCheck: IHealthCheck)

    /**
     * @param setIdentifier A string used to distinguish between different records with the same
     * combination of DNS name and type.
     * It can only be set when either weight or geoLocation is defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     */
    public fun identifier(setIdentifier: String)

    /**
     * @param multiValueAnswer Whether to return multiple values, such as IP addresses for your web
     * servers, in response to DNS queries.
     */
    public fun multiValueAnswer(multiValueAnswer: Boolean)

    /**
     * @param recordName The subdomain name for this record. This should be relative to the zone
     * root name.
     * For example, if you want to create a record for acme.example.com, specify
     * "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a
     * ".". For example, "acme.example.com.".
     */
    public fun recordName(recordName: String)

    /**
     * @param region The Amazon EC2 Region where you created the resource that this resource record
     * set refers to.
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets,
     * Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region.
     * Route 53 then returns the value that is associated with the selected resource record set.
     */
    public fun region(region: String)

    /**
     * @param ttl The resource record cache time to live (TTL).
     */
    public fun ttl(ttl: Duration)

    /**
     * @param weight Among resource record sets that have the same combination of DNS name and type,
     * a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set.
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type.
     * Route 53 then responds to queries based on the ratio of a resource's weight to the total.
     *
     * This value can be a number between 0 and 255.
     */
    public fun weight(weight: Number)

    /**
     * @param zone The hosted zone in which to define the new record. 
     */
    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CnameRecordProps.Builder =
        software.amazon.awscdk.services.route53.CnameRecordProps.builder()

    /**
     * @param comment A comment to add on the record.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     * exists (dangerous!).
     * This allows to deploy a new record set while minimizing the downtime because the
     * new record set will be created immediately after the existing one is deleted. It
     * also avoids "manual" actions to delete existing record sets.
     *
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
     * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
     * will delete the record!
     */
    override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
    }

    /**
     * @param domainName The domain name of the target that this record should point to. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location.
     */
    override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation.Companion::unwrap))
    }

    /**
     * @param healthCheck The health check to associate with the record set.
     * Route53 will return this record set in response to DNS queries only if the health check is
     * passing.
     */
    override fun healthCheck(healthCheck: IHealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(IHealthCheck.Companion::unwrap))
    }

    /**
     * @param setIdentifier A string used to distinguish between different records with the same
     * combination of DNS name and type.
     * It can only be set when either weight or geoLocation is defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     */
    override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    /**
     * @param multiValueAnswer Whether to return multiple values, such as IP addresses for your web
     * servers, in response to DNS queries.
     */
    override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    /**
     * @param recordName The subdomain name for this record. This should be relative to the zone
     * root name.
     * For example, if you want to create a record for acme.example.com, specify
     * "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a
     * ".". For example, "acme.example.com.".
     */
    override fun recordName(recordName: String) {
      cdkBuilder.recordName(recordName)
    }

    /**
     * @param region The Amazon EC2 Region where you created the resource that this resource record
     * set refers to.
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets,
     * Route 53 selects the latency resource record set that has the lowest latency between the end
     * user and the associated Amazon EC2 Region.
     * Route 53 then returns the value that is associated with the selected resource record set.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param ttl The resource record cache time to live (TTL).
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration.Companion::unwrap))
    }

    /**
     * @param weight Among resource record sets that have the same combination of DNS name and type,
     * a value that determines the proportion of DNS queries that Amazon Route 53 responds to using the
     * current resource record set.
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type.
     * Route 53 then responds to queries based on the ratio of a resource's weight to the total.
     *
     * This value can be a number between 0 and 255.
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    /**
     * @param zone The hosted zone in which to define the new record. 
     */
    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.CnameRecordProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CnameRecordProps,
  ) : CdkObject(cdkObject),
      CnameRecordProps {
    /**
     * A comment to add on the record.
     *
     * Default: no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

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
     */
    override fun deleteExisting(): Boolean? = unwrap(this).getDeleteExisting()

    /**
     * The domain name of the target that this record should point to.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The geographical origin for this record to return DNS records based on the user's location.
     */
    override fun geoLocation(): GeoLocation? = unwrap(this).getGeoLocation()?.let(GeoLocation::wrap)

    /**
     * The health check to associate with the record set.
     *
     * Route53 will return this record set in response to DNS queries only if the health check is
     * passing.
     *
     * Default: - No health check configured
     */
    override fun healthCheck(): IHealthCheck? =
        unwrap(this).getHealthCheck()?.let(IHealthCheck::wrap)

    /**
     * Whether to return multiple values, such as IP addresses for your web servers, in response to
     * DNS queries.
     *
     * Default: false
     */
    override fun multiValueAnswer(): Boolean? = unwrap(this).getMultiValueAnswer()

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
     */
    override fun recordName(): String? = unwrap(this).getRecordName()

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
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * A string used to distinguish between different records with the same combination of DNS name
     * and type.
     *
     * It can only be set when either weight or geoLocation is defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     *
     * Default: - Auto generated string
     */
    override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.minutes(30)
     */
    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

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
     */
    override fun weight(): Number? = unwrap(this).getWeight()

    /**
     * The hosted zone in which to define the new record.
     */
    override fun zone(): IHostedZone = unwrap(this).getZone().let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CnameRecordProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CnameRecordProps):
        CnameRecordProps = CdkObjectWrappers.wrap(cdkObject) as? CnameRecordProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CnameRecordProps):
        software.amazon.awscdk.services.route53.CnameRecordProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.CnameRecordProps
  }
}
