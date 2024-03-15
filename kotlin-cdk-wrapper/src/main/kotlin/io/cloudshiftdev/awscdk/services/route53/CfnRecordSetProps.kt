@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRecordSetProps {
  public fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

  public fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

  public fun comment(): String? = unwrap(this).getComment()

  public fun failover(): String? = unwrap(this).getFailover()

  public fun geoLocation(): Any? = unwrap(this).getGeoLocation()

  public fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

  public fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

  public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  public fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

  public fun name(): String

  public fun region(): String? = unwrap(this).getRegion()

  public fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

  public fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

  public fun ttl(): String? = unwrap(this).getTtl()

  public fun type(): String

  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun aliasTarget(aliasTarget: IResolvable)

    public fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb327bf0128e3e38981f4dc1c663a8ab3fee2a6008cf4c3e2236da2aa08b153e")
    public fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty.Builder.() -> Unit)

    public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable)

    public fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df621563b635c66810723726622d0bd45492a369e0ba90e7d9dc5ca6e7e2d22")
    public
        fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty.Builder.() -> Unit)

    public fun comment(comment: String)

    public fun failover(failover: String)

    public fun geoLocation(geoLocation: IResolvable)

    public fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f772b414cb62285a4a18ecc8252008abaa66d492043f2d3deec1571822097946")
    public fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty.Builder.() -> Unit)

    public fun geoProximityLocation(geoProximityLocation: IResolvable)

    public fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1284365c9ef9d93d47bd952bf53e2aa6d678f2892426e9470b9340f2213d7a13")
    public
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty.Builder.() -> Unit)

    public fun healthCheckId(healthCheckId: String)

    public fun hostedZoneId(hostedZoneId: String)

    public fun hostedZoneName(hostedZoneName: String)

    public fun identifier(setIdentifier: String)

    public fun multiValueAnswer(multiValueAnswer: Boolean)

    public fun multiValueAnswer(multiValueAnswer: IResolvable)

    public fun name(name: String)

    public fun region(region: String)

    public fun resourceRecords(resourceRecords: List<String>)

    public fun resourceRecords(vararg resourceRecords: String)

    public fun ttl(ttl: String)

    public fun type(type: String)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetProps.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetProps.builder()

    override fun aliasTarget(aliasTarget: IResolvable) {
      cdkBuilder.aliasTarget(aliasTarget.let(IResolvable::unwrap))
    }

    override fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty) {
      cdkBuilder.aliasTarget(aliasTarget.let(CfnRecordSet.AliasTargetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb327bf0128e3e38981f4dc1c663a8ab3fee2a6008cf4c3e2236da2aa08b153e")
    override fun aliasTarget(aliasTarget: CfnRecordSet.AliasTargetProperty.Builder.() -> Unit): Unit
        = aliasTarget(CfnRecordSet.AliasTargetProperty(aliasTarget))

    override fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(IResolvable::unwrap))
    }

    override fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(CfnRecordSet.CidrRoutingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0df621563b635c66810723726622d0bd45492a369e0ba90e7d9dc5ca6e7e2d22")
    override
        fun cidrRoutingConfig(cidrRoutingConfig: CfnRecordSet.CidrRoutingConfigProperty.Builder.() -> Unit):
        Unit = cidrRoutingConfig(CfnRecordSet.CidrRoutingConfigProperty(cidrRoutingConfig))

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun failover(failover: String) {
      cdkBuilder.failover(failover)
    }

    override fun geoLocation(geoLocation: IResolvable) {
      cdkBuilder.geoLocation(geoLocation.let(IResolvable::unwrap))
    }

    override fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty) {
      cdkBuilder.geoLocation(geoLocation.let(CfnRecordSet.GeoLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f772b414cb62285a4a18ecc8252008abaa66d492043f2d3deec1571822097946")
    override fun geoLocation(geoLocation: CfnRecordSet.GeoLocationProperty.Builder.() -> Unit): Unit
        = geoLocation(CfnRecordSet.GeoLocationProperty(geoLocation))

    override fun geoProximityLocation(geoProximityLocation: IResolvable) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(IResolvable::unwrap))
    }

    override
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(CfnRecordSet.GeoProximityLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1284365c9ef9d93d47bd952bf53e2aa6d678f2892426e9470b9340f2213d7a13")
    override
        fun geoProximityLocation(geoProximityLocation: CfnRecordSet.GeoProximityLocationProperty.Builder.() -> Unit):
        Unit = geoProximityLocation(CfnRecordSet.GeoProximityLocationProperty(geoProximityLocation))

    override fun healthCheckId(healthCheckId: String) {
      cdkBuilder.healthCheckId(healthCheckId)
    }

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    override fun multiValueAnswer(multiValueAnswer: IResolvable) {
      cdkBuilder.multiValueAnswer(multiValueAnswer.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun resourceRecords(resourceRecords: List<String>) {
      cdkBuilder.resourceRecords(resourceRecords)
    }

    override fun resourceRecords(vararg resourceRecords: String): Unit =
        resourceRecords(resourceRecords.toList())

    override fun ttl(ttl: String) {
      cdkBuilder.ttl(ttl)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetProps,
  ) : CdkObject(cdkObject), CfnRecordSetProps {
    override fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

    override fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

    override fun comment(): String? = unwrap(this).getComment()

    override fun failover(): String? = unwrap(this).getFailover()

    override fun geoLocation(): Any? = unwrap(this).getGeoLocation()

    override fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

    override fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

    override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    override fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

    override fun name(): String = unwrap(this).getName()

    override fun region(): String? = unwrap(this).getRegion()

    override fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

    override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

    override fun ttl(): String? = unwrap(this).getTtl()

    override fun type(): String = unwrap(this).getType()

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetProps):
        CfnRecordSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetProps):
        software.amazon.awscdk.services.route53.CfnRecordSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.CfnRecordSetProps
  }
}
