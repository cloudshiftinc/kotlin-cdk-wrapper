package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRecordSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

  public open fun aliasTarget(`value`: IResolvable) {
    unwrap(this).setAliasTarget(`value`.let(IResolvable::unwrap))
  }

  public open fun aliasTarget(`value`: AliasTargetProperty) {
    unwrap(this).setAliasTarget(`value`.let(AliasTargetProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("36b2ad6466968e6ca2c493d69667f539439134158c735025fddb71ff64b05eb3")
  public open fun aliasTarget(`value`: AliasTargetProperty.Builder.() -> Unit): Unit =
      aliasTarget(AliasTargetProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

  public open fun cidrRoutingConfig(`value`: IResolvable) {
    unwrap(this).setCidrRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun cidrRoutingConfig(`value`: CidrRoutingConfigProperty) {
    unwrap(this).setCidrRoutingConfig(`value`.let(CidrRoutingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8663cbf43898024f1aa17d2105bba654ce20ebc088e7f917ab37faa75c17591b")
  public open fun cidrRoutingConfig(`value`: CidrRoutingConfigProperty.Builder.() -> Unit): Unit =
      cidrRoutingConfig(CidrRoutingConfigProperty(`value`))

  public open fun comment(): String? = unwrap(this).getComment()

  public open fun comment(`value`: String) {
    unwrap(this).setComment(`value`)
  }

  public open fun failover(): String? = unwrap(this).getFailover()

  public open fun failover(`value`: String) {
    unwrap(this).setFailover(`value`)
  }

  public open fun geoLocation(): Any? = unwrap(this).getGeoLocation()

  public open fun geoLocation(`value`: IResolvable) {
    unwrap(this).setGeoLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun geoLocation(`value`: GeoLocationProperty) {
    unwrap(this).setGeoLocation(`value`.let(GeoLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("843a5b67a75197819fffa140eac577670ec50ba799ab4b5027aa619f6ead0e09")
  public open fun geoLocation(`value`: GeoLocationProperty.Builder.() -> Unit): Unit =
      geoLocation(GeoLocationProperty(`value`))

  public open fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

  public open fun geoProximityLocation(`value`: IResolvable) {
    unwrap(this).setGeoProximityLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun geoProximityLocation(`value`: GeoProximityLocationProperty) {
    unwrap(this).setGeoProximityLocation(`value`.let(GeoProximityLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1212f96e83eb73a4dff281d02e252bf07cad9be4ed01d02c898397a3e902f24d")
  public open fun geoProximityLocation(`value`: GeoProximityLocationProperty.Builder.() -> Unit):
      Unit = geoProximityLocation(GeoProximityLocationProperty(`value`))

  public open fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

  public open fun healthCheckId(`value`: String) {
    unwrap(this).setHealthCheckId(`value`)
  }

  public open fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  public open fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  public open fun hostedZoneName(`value`: String) {
    unwrap(this).setHostedZoneName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

  public open fun multiValueAnswer(`value`: Boolean) {
    unwrap(this).setMultiValueAnswer(`value`)
  }

  public open fun multiValueAnswer(`value`: IResolvable) {
    unwrap(this).setMultiValueAnswer(`value`.let(IResolvable::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun region(): String? = unwrap(this).getRegion()

  public open fun region(`value`: String) {
    unwrap(this).setRegion(`value`)
  }

  public open fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

  public open fun resourceRecords(`value`: List<String>) {
    unwrap(this).setResourceRecords(`value`)
  }

  public open fun resourceRecords(vararg `value`: String): Unit = resourceRecords(`value`.toList())

  public open fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

  public open fun setIdentifier(`value`: String) {
    unwrap(this).setSetIdentifier(`value`)
  }

  public open fun ttl(): String? = unwrap(this).getTtl()

  public open fun ttl(`value`: String) {
    unwrap(this).setTtl(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun weight(): Number? = unwrap(this).getWeight()

  public open fun weight(`value`: Number) {
    unwrap(this).setWeight(`value`)
  }

  public interface Builder {
    public fun aliasTarget(aliasTarget: IResolvable)

    public fun aliasTarget(aliasTarget: AliasTargetProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5994a15da72fc27f20f23762e3f4f8c34cd37630c81ea50ed49902ebb50f3f9")
    public fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit)

    public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable)

    public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5e59393b9a4d86b9ba6b0fb0974fd1995c228dd8861360ccdace167a6b2643b")
    public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit)

    public fun comment(comment: String)

    public fun failover(failover: String)

    public fun geoLocation(geoLocation: IResolvable)

    public fun geoLocation(geoLocation: GeoLocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6af2db8be2050fe868bfbff7dd62eab6387d122b375e41577c4fedbbb3cf4b9")
    public fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit)

    public fun geoProximityLocation(geoProximityLocation: IResolvable)

    public fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c346de95c08ddd5430763d185d0b37c2963d7451140d63894a46476b488cdd1")
    public
        fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSet.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSet.Builder.create(scope, id)

    override fun aliasTarget(aliasTarget: IResolvable) {
      cdkBuilder.aliasTarget(aliasTarget.let(IResolvable::unwrap))
    }

    override fun aliasTarget(aliasTarget: AliasTargetProperty) {
      cdkBuilder.aliasTarget(aliasTarget.let(AliasTargetProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5994a15da72fc27f20f23762e3f4f8c34cd37630c81ea50ed49902ebb50f3f9")
    override fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit): Unit =
        aliasTarget(AliasTargetProperty(aliasTarget))

    override fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(IResolvable::unwrap))
    }

    override fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty) {
      cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(CidrRoutingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5e59393b9a4d86b9ba6b0fb0974fd1995c228dd8861360ccdace167a6b2643b")
    override fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit):
        Unit = cidrRoutingConfig(CidrRoutingConfigProperty(cidrRoutingConfig))

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun failover(failover: String) {
      cdkBuilder.failover(failover)
    }

    override fun geoLocation(geoLocation: IResolvable) {
      cdkBuilder.geoLocation(geoLocation.let(IResolvable::unwrap))
    }

    override fun geoLocation(geoLocation: GeoLocationProperty) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6af2db8be2050fe868bfbff7dd62eab6387d122b375e41577c4fedbbb3cf4b9")
    override fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit): Unit =
        geoLocation(GeoLocationProperty(geoLocation))

    override fun geoProximityLocation(geoProximityLocation: IResolvable) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(IResolvable::unwrap))
    }

    override fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty) {
      cdkBuilder.geoProximityLocation(geoProximityLocation.let(GeoProximityLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c346de95c08ddd5430763d185d0b37c2963d7451140d63894a46476b488cdd1")
    override
        fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty.Builder.() -> Unit):
        Unit = geoProximityLocation(GeoProximityLocationProperty(geoProximityLocation))

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

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecordSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecordSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet): CfnRecordSet
        = CfnRecordSet(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSet): software.amazon.awscdk.services.route53.CfnRecordSet
        = wrapped.cdkObject
  }

  public interface GeoLocationProperty {
    public fun continentCode(): String? = unwrap(this).getContinentCode()

    public fun countryCode(): String? = unwrap(this).getCountryCode()

    public fun subdivisionCode(): String? = unwrap(this).getSubdivisionCode()

    public interface Builder {
      public fun continentCode(continentCode: String)

      public fun countryCode(countryCode: String)

      public fun subdivisionCode(subdivisionCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty.builder()

      override fun continentCode(continentCode: String) {
        cdkBuilder.continentCode(continentCode)
      }

      override fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
      }

      override fun subdivisionCode(subdivisionCode: String) {
        cdkBuilder.subdivisionCode(subdivisionCode)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty,
    ) : GeoLocationProperty {
      override fun continentCode(): String? = unwrap(this).getContinentCode()

      override fun countryCode(): String? = unwrap(this).getCountryCode()

      override fun subdivisionCode(): String? = unwrap(this).getSubdivisionCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty):
          GeoLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CoordinatesProperty {
    public fun latitude(): String

    public fun longitude(): String

    public interface Builder {
      public fun latitude(latitude: String)

      public fun longitude(longitude: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty.builder()

      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty,
    ) : CoordinatesProperty {
      override fun latitude(): String = unwrap(this).getLatitude()

      override fun longitude(): String = unwrap(this).getLongitude()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CoordinatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty):
          CoordinatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoordinatesProperty):
          software.amazon.awscdk.services.route53.CfnRecordSet.CoordinatesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CidrRoutingConfigProperty {
    public fun collectionId(): String

    public fun locationName(): String

    public interface Builder {
      public fun collectionId(collectionId: String)

      public fun locationName(locationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty.builder()

      override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty,
    ) : CidrRoutingConfigProperty {
      override fun collectionId(): String = unwrap(this).getCollectionId()

      override fun locationName(): String = unwrap(this).getLocationName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CidrRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty):
          CidrRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CidrRoutingConfigProperty):
          software.amazon.awscdk.services.route53.CfnRecordSet.CidrRoutingConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GeoProximityLocationProperty {
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    public fun bias(): Number? = unwrap(this).getBias()

    public fun coordinates(): Any? = unwrap(this).getCoordinates()

    public fun localZoneGroup(): String? = unwrap(this).getLocalZoneGroup()

    public interface Builder {
      public fun awsRegion(awsRegion: String)

      public fun bias(bias: Number)

      public fun coordinates(coordinates: IResolvable)

      public fun coordinates(coordinates: CoordinatesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d79266c4c10cffdfcef58e11e4a6d08c2a0bb2ce8811809043fe4aa09a2f3b")
      public fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit)

      public fun localZoneGroup(localZoneGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty.Builder
          =
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty.builder()

      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      override fun bias(bias: Number) {
        cdkBuilder.bias(bias)
      }

      override fun coordinates(coordinates: IResolvable) {
        cdkBuilder.coordinates(coordinates.let(IResolvable::unwrap))
      }

      override fun coordinates(coordinates: CoordinatesProperty) {
        cdkBuilder.coordinates(coordinates.let(CoordinatesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d79266c4c10cffdfcef58e11e4a6d08c2a0bb2ce8811809043fe4aa09a2f3b")
      override fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit): Unit =
          coordinates(CoordinatesProperty(coordinates))

      override fun localZoneGroup(localZoneGroup: String) {
        cdkBuilder.localZoneGroup(localZoneGroup)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty,
    ) : GeoProximityLocationProperty {
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      override fun bias(): Number? = unwrap(this).getBias()

      override fun coordinates(): Any? = unwrap(this).getCoordinates()

      override fun localZoneGroup(): String? = unwrap(this).getLocalZoneGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeoProximityLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty):
          GeoProximityLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoProximityLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSet.GeoProximityLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AliasTargetProperty {
    public fun dnsName(): String

    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    public fun hostedZoneId(): String

    public interface Builder {
      public fun dnsName(dnsName: String)

      public fun evaluateTargetHealth(evaluateTargetHealth: Boolean)

      public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable)

      public fun hostedZoneId(hostedZoneId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty.builder()

      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
      }

      override fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable::unwrap))
      }

      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty,
    ) : AliasTargetProperty {
      override fun dnsName(): String = unwrap(this).getDnsName()

      override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AliasTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty):
          AliasTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasTargetProperty):
          software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
