package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class MxRecord internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.MxRecord,
) : RecordSet(cdkObject) {
  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun deleteExisting(deleteExisting: Boolean) {
    }

    public fun geoLocation(geoLocation: GeoLocation) {
    }

    public fun identifier(setIdentifier: String) {
    }

    public fun multiValueAnswer(multiValueAnswer: Boolean) {
    }

    public fun recordName(recordName: String) {
    }

    public fun region(region: String) {
    }

    public fun ttl(ttl: Duration) {
    }

    public fun values(values: List<MxRecordValue>) {
    }

    public fun weight(weight: Number) {
    }

    public fun zone(zone: IHostedZone) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.MxRecord.Builder =
        software.amazon.awscdk.services.route53.MxRecord.Builder.create(scope, id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
    }

    public override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation::unwrap))
    }

    public override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    public override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    public override fun recordName(recordName: String) {
      cdkBuilder.recordName(recordName)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public override fun values(values: List<MxRecordValue>) {
      cdkBuilder.values(values.map(MxRecordValue::unwrap))
    }

    public override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.MxRecord = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): MxRecord {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return MxRecord(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.MxRecord): MxRecord =
        MxRecord(cdkObject)

    internal fun unwrap(wrapped: MxRecord): software.amazon.awscdk.services.route53.MxRecord =
        wrapped.cdkObject
  }
}
