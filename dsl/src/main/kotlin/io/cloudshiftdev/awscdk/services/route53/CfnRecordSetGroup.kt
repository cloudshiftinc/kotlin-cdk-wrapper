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

public open class CfnRecordSetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun comment(): String? = unwrap(this).getComment()

  public open fun comment(`value`: String) {
    unwrap(this).setComment(`value`)
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

  public open fun recordSets(): Any? = unwrap(this).getRecordSets()

  public open fun recordSets(`value`: IResolvable) {
    unwrap(this).setRecordSets(`value`.let(IResolvable::unwrap))
  }

  public open fun recordSets(__idx_ac66f0: List<Any>) {
    unwrap(this).setRecordSets(__idx_ac66f0)
  }

  public interface Builder {
    public fun comment(comment: String)

    public fun hostedZoneId(hostedZoneId: String)

    public fun hostedZoneName(hostedZoneName: String)

    public fun recordSets(recordSets: IResolvable)

    public fun recordSets(recordSets: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetGroup.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetGroup.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    override fun recordSets(recordSets: IResolvable) {
      cdkBuilder.recordSets(recordSets.let(IResolvable::unwrap))
    }

    override fun recordSets(recordSets: List<Any>) {
      cdkBuilder.recordSets(recordSets)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecordSetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecordSetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup):
        CfnRecordSetGroup = CfnRecordSetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetGroup):
        software.amazon.awscdk.services.route53.CfnRecordSetGroup = wrapped.cdkObject
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
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty.builder()

      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty):
          CoordinatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoordinatesProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty = (wrapped
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
      @JvmName("403c1cd48607f49f91e0e983b38dbdc5005b4fddb480ba24dc6ac49f3e4e1609")
      public fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit)

      public fun localZoneGroup(localZoneGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty.Builder
          =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty.builder()

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
      @JvmName("403c1cd48607f49f91e0e983b38dbdc5005b4fddb480ba24dc6ac49f3e4e1609")
      override fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit): Unit =
          coordinates(CoordinatesProperty(coordinates))

      override fun localZoneGroup(localZoneGroup: String) {
        cdkBuilder.localZoneGroup(localZoneGroup)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty):
          GeoProximityLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoProximityLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty.builder()

      override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty):
          CidrRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CidrRoutingConfigProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty.builder()

      override fun continentCode(continentCode: String) {
        cdkBuilder.continentCode(continentCode)
      }

      override fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
      }

      override fun subdivisionCode(subdivisionCode: String) {
        cdkBuilder.subdivisionCode(subdivisionCode)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty):
          GeoLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty = (wrapped
          as Wrapper).cdkObject
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
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty):
          AliasTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasTargetProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RecordSetProperty {
    public fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

    public fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

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

    public interface Builder {
      public fun aliasTarget(aliasTarget: IResolvable)

      public fun aliasTarget(aliasTarget: AliasTargetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc3fca356b21acf6b38aa9cf75411c4f33ab2f2525b7e5f768c4291bc300ab9")
      public fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit)

      public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable)

      public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f994abe22d3e39e024a475c2fe39bae7e3c8393f2519714f52cd2abb0591254")
      public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit)

      public fun failover(failover: String)

      public fun geoLocation(geoLocation: IResolvable)

      public fun geoLocation(geoLocation: GeoLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50ec19885adc4a116a32544c092c0acd0fd3577beaf34dacff846f2b171c6006")
      public fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit)

      public fun geoProximityLocation(geoProximityLocation: IResolvable)

      public fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb7bba9ec85e663409ea69ea66ef74ac4c0cde53214787b6a6c399a7c1946b37")
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

      public fun ttl(ttl: String)

      public fun type(type: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty.builder()

      override fun aliasTarget(aliasTarget: IResolvable) {
        cdkBuilder.aliasTarget(aliasTarget.let(IResolvable::unwrap))
      }

      override fun aliasTarget(aliasTarget: AliasTargetProperty) {
        cdkBuilder.aliasTarget(aliasTarget.let(AliasTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc3fca356b21acf6b38aa9cf75411c4f33ab2f2525b7e5f768c4291bc300ab9")
      override fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit): Unit =
          aliasTarget(AliasTargetProperty(aliasTarget))

      override fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(IResolvable::unwrap))
      }

      override fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(CidrRoutingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f994abe22d3e39e024a475c2fe39bae7e3c8393f2519714f52cd2abb0591254")
      override
          fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit):
          Unit = cidrRoutingConfig(CidrRoutingConfigProperty(cidrRoutingConfig))

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
      @JvmName("50ec19885adc4a116a32544c092c0acd0fd3577beaf34dacff846f2b171c6006")
      override fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit): Unit =
          geoLocation(GeoLocationProperty(geoLocation))

      override fun geoProximityLocation(geoProximityLocation: IResolvable) {
        cdkBuilder.geoProximityLocation(geoProximityLocation.let(IResolvable::unwrap))
      }

      override fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty) {
        cdkBuilder.geoProximityLocation(geoProximityLocation.let(GeoProximityLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb7bba9ec85e663409ea69ea66ef74ac4c0cde53214787b6a6c399a7c1946b37")
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

      override fun ttl(ttl: String) {
        cdkBuilder.ttl(ttl)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty,
    ) : RecordSetProperty {
      override fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

      override fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

      override fun failover(): String? = unwrap(this).getFailover()

      override fun geoLocation(): Any? = unwrap(this).getGeoLocation()

      override fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

      override fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      override fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

      override fun name(): String = unwrap(this).getName()

      override fun region(): String? = unwrap(this).getRegion()

      override fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?:
          emptyList()

      override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

      override fun ttl(): String? = unwrap(this).getTtl()

      override fun type(): String = unwrap(this).getType()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty):
          RecordSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordSetProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
