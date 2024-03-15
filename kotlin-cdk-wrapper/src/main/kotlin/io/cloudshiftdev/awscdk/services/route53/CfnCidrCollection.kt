@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCidrCollection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun locations(): Any? = unwrap(this).getLocations()

  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable::unwrap))
  }

  public open fun locations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocations(__idx_ac66f0)
  }

  public open fun locations(vararg __idx_ac66f0: Any): Unit = locations(__idx_ac66f0.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun locations(locations: IResolvable)

    public fun locations(locations: List<Any>)

    public fun locations(vararg locations: Any)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnCidrCollection.Builder =
        software.amazon.awscdk.services.route53.CfnCidrCollection.Builder.create(scope, id)

    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
    }

    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
    }

    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnCidrCollection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCidrCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCidrCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection):
        CfnCidrCollection = CfnCidrCollection(cdkObject)

    internal fun unwrap(wrapped: CfnCidrCollection):
        software.amazon.awscdk.services.route53.CfnCidrCollection = wrapped.cdkObject
  }

  public interface LocationProperty {
    public fun cidrList(): List<String>

    public fun locationName(): String

    @CdkDslMarker
    public interface Builder {
      public fun cidrList(cidrList: List<String>)

      public fun cidrList(vararg cidrList: String)

      public fun locationName(locationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty.Builder =
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty.builder()

      override fun cidrList(cidrList: List<String>) {
        cdkBuilder.cidrList(cidrList)
      }

      override fun cidrList(vararg cidrList: String): Unit = cidrList(cidrList.toList())

      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty,
    ) : CdkObject(cdkObject), LocationProperty {
      override fun cidrList(): List<String> = unwrap(this).getCidrList()

      override fun locationName(): String = unwrap(this).getLocationName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnCidrCollection.LocationProperty
    }
  }
}
