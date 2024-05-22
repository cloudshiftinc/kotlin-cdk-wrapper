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
 * Construction properties to import existing ARecord as target.
 *
 * Example:
 *
 * ```
 * HostedZone myZone;
 * String targetRecord = "existing.record.cdk.local";
 * ARecord record = ARecord.fromARecordAttributes(this, "A", ARecordAttrs.builder()
 * .zone(myZone)
 * .recordName("test")
 * .targetDNS(targetRecord)
 * .build());
 * ```
 */
public interface ARecordAttrs : RecordSetOptions {
  /**
   * Existing A record DNS name to set RecordTarget.
   */
  public fun targetDNS(): String

  /**
   * A builder for [ARecordAttrs]
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
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location.
     */
    public fun geoLocation(geoLocation: GeoLocation)

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
     * @param targetDns Existing A record DNS name to set RecordTarget. 
     */
    public fun targetDns(targetDns: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.route53.ARecordAttrs.Builder =
        software.amazon.awscdk.services.route53.ARecordAttrs.builder()

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
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     * user's location.
     */
    override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation.Companion::unwrap))
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
     * @param targetDns Existing A record DNS name to set RecordTarget. 
     */
    override fun targetDns(targetDns: String) {
      cdkBuilder.targetDns(targetDns)
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

    public fun build(): software.amazon.awscdk.services.route53.ARecordAttrs = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.ARecordAttrs,
  ) : CdkObject(cdkObject), ARecordAttrs {
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
     * The geographical origin for this record to return DNS records based on the user's location.
     */
    override fun geoLocation(): GeoLocation? = unwrap(this).getGeoLocation()?.let(GeoLocation::wrap)

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
     * Existing A record DNS name to set RecordTarget.
     */
    override fun targetDNS(): String = unwrap(this).getTargetDNS()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ARecordAttrs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.ARecordAttrs): ARecordAttrs
        = CdkObjectWrappers.wrap(cdkObject) as? ARecordAttrs ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ARecordAttrs): software.amazon.awscdk.services.route53.ARecordAttrs
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.route53.ARecordAttrs
  }
}
