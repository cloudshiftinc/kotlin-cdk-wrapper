package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReceiptFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun filter(): Any = unwrap(this).getFilter()

  public open fun filter(`value`: IResolvable) {
    unwrap(this).setFilter(`value`.let(IResolvable::unwrap))
  }

  public open fun filter(`value`: FilterProperty) {
    unwrap(this).setFilter(`value`.let(FilterProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f161bfe860732c11b7ee13cf4222091e0ae88ab012a0c924bc7d614a489431a")
  public open fun filter(`value`: FilterProperty.Builder.() -> Unit): Unit =
      filter(FilterProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun filter(filter: IResolvable) {
    }

    public fun filter(filter: FilterProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fad0b3c8597a7924fde228bf1290235e29ab81087c4ba41f540359d224fe12c1")
    public fun filter(filter: FilterProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder.create(scope, id)

    public override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    public override fun filter(filter: FilterProperty) {
      cdkBuilder.filter(filter.let(FilterProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fad0b3c8597a7924fde228bf1290235e29ab81087c4ba41f540359d224fe12c1")
    public override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(filter))

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReceiptFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReceiptFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter):
        CfnReceiptFilter = CfnReceiptFilter(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptFilter):
        software.amazon.awscdk.services.ses.CfnReceiptFilter = wrapped.cdkObject
  }

  public interface IpFilterProperty {
    public fun cidr(): String

    public fun policy(): String

    public interface Builder {
      public fun cidr(cidr: String) {
      }

      public fun policy(policy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.builder()

      public override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public override fun policy(policy: String) {
        cdkBuilder.policy(policy)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty,
    ) : IpFilterProperty {
      public override fun cidr(): String = unwrap(this).getCidr()

      public override fun policy(): String = unwrap(this).getPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IpFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty):
          IpFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpFilterProperty):
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun ipFilter(): Any

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun ipFilter(ipFilter: IResolvable) {
      }

      public fun ipFilter(ipFilter: IpFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3bada411daede1a2b72148c9e6d98cc81b2e0cf0db3151b4bbdb6fe53944ad1")
      public fun ipFilter(ipFilter: IpFilterProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.builder()

      public override fun ipFilter(ipFilter: IResolvable) {
        cdkBuilder.ipFilter(ipFilter.let(IResolvable::unwrap))
      }

      public override fun ipFilter(ipFilter: IpFilterProperty) {
        cdkBuilder.ipFilter(ipFilter.let(IpFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3bada411daede1a2b72148c9e6d98cc81b2e0cf0db3151b4bbdb6fe53944ad1")
      public override fun ipFilter(ipFilter: IpFilterProperty.Builder.() -> Unit): Unit =
          ipFilter(IpFilterProperty(ipFilter))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty,
    ) : FilterProperty {
      public override fun ipFilter(): Any = unwrap(this).getIpFilter()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
