@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CnameRecordProps : RecordSetOptions {
  public fun domainName(): String

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun deleteExisting(deleteExisting: Boolean)

    public fun domainName(domainName: String)

    public fun geoLocation(geoLocation: GeoLocation)

    public fun identifier(setIdentifier: String)

    public fun multiValueAnswer(multiValueAnswer: Boolean)

    public fun recordName(recordName: String)

    public fun region(region: String)

    public fun ttl(ttl: Duration)

    public fun weight(weight: Number)

    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CnameRecordProps.Builder =
        software.amazon.awscdk.services.route53.CnameRecordProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation::unwrap))
    }

    override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    override fun recordName(recordName: String) {
      cdkBuilder.recordName(recordName)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.CnameRecordProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CnameRecordProps,
  ) : CdkObject(cdkObject), CnameRecordProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun deleteExisting(): Boolean? = unwrap(this).getDeleteExisting()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun geoLocation(): GeoLocation? = unwrap(this).getGeoLocation()?.let(GeoLocation::wrap)

    override fun multiValueAnswer(): Boolean? = unwrap(this).getMultiValueAnswer()

    override fun recordName(): String? = unwrap(this).getRecordName()

    override fun region(): String? = unwrap(this).getRegion()

    override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

    override fun weight(): Number? = unwrap(this).getWeight()

    override fun zone(): IHostedZone = unwrap(this).getZone().let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CnameRecordProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CnameRecordProps):
        CnameRecordProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CnameRecordProps):
        software.amazon.awscdk.services.route53.CnameRecordProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.CnameRecordProps
  }
}
