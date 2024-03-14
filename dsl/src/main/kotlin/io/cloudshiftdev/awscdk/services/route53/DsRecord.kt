package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DsRecord internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.DsRecord,
) : RecordSet(cdkObject) {
  public interface Builder {
    public fun comment(comment: String)

    public fun deleteExisting(deleteExisting: Boolean)

    public fun geoLocation(geoLocation: GeoLocation)

    public fun identifier(setIdentifier: String)

    public fun multiValueAnswer(multiValueAnswer: Boolean)

    public fun recordName(recordName: String)

    public fun region(region: String)

    public fun ttl(ttl: Duration)

    public fun values(values: List<String>)

    public fun weight(weight: Number)

    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.DsRecord.Builder =
        software.amazon.awscdk.services.route53.DsRecord.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
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

    override fun values(values: List<String>) {
      cdkBuilder.values(values)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.DsRecord = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DsRecord {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DsRecord(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.DsRecord): DsRecord =
        DsRecord(cdkObject)

    internal fun unwrap(wrapped: DsRecord): software.amazon.awscdk.services.route53.DsRecord =
        wrapped.cdkObject
  }
}
