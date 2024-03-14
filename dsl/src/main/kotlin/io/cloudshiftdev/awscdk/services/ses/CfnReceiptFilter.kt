package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReceiptFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   */
  public open fun filter(): Any = unwrap(this).getFilter()

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   */
  public open fun filter(`value`: IResolvable) {
    unwrap(this).setFilter(`value`.let(IResolvable::unwrap))
  }

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   */
  public open fun filter(`value`: FilterProperty) {
    unwrap(this).setFilter(`value`.let(FilterProperty::unwrap))
  }

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f161bfe860732c11b7ee13cf4222091e0ae88ab012a0c924bc7d614a489431a")
  public open fun filter(`value`: FilterProperty.Builder.() -> Unit): Unit =
      filter(FilterProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnReceiptFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    public fun filter(filter: IResolvable)

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    public fun filter(filter: FilterProperty)

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fad0b3c8597a7924fde228bf1290235e29ab81087c4ba41f540359d224fe12c1")
    public fun filter(filter: FilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder.create(scope, id)

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    override fun filter(filter: FilterProperty) {
      cdkBuilder.filter(filter.let(FilterProperty::unwrap))
    }

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fad0b3c8597a7924fde228bf1290235e29ab81087c4ba41f540359d224fe12c1")
    override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
        filter(FilterProperty(filter))

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter = cdkBuilder.build()
  }

  public companion object {
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
    /**
     * A single IP address or a range of IP addresses to block or allow, specified in Classless
     * Inter-Domain Routing (CIDR) notation.
     *
     * An example of a single email address is 10.0.0.1. An example of a range of IP addresses is
     * 10.0.0.1/24. For more information about CIDR notation, see [RFC
     * 2317](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2317) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
     */
    public fun cidr(): String

    /**
     * Indicates whether to block or allow incoming mail from the specified IP addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
     */
    public fun policy(): String

    /**
     * A builder for [IpFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr A single IP address or a range of IP addresses to block or allow, specified in
       * Classless Inter-Domain Routing (CIDR) notation. 
       * An example of a single email address is 10.0.0.1. An example of a range of IP addresses is
       * 10.0.0.1/24. For more information about CIDR notation, see [RFC
       * 2317](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2317) .
       */
      public fun cidr(cidr: String)

      /**
       * @param policy Indicates whether to block or allow incoming mail from the specified IP
       * addresses. 
       */
      public fun policy(policy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.builder()

      /**
       * @param cidr A single IP address or a range of IP addresses to block or allow, specified in
       * Classless Inter-Domain Routing (CIDR) notation. 
       * An example of a single email address is 10.0.0.1. An example of a range of IP addresses is
       * 10.0.0.1/24. For more information about CIDR notation, see [RFC
       * 2317](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2317) .
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param policy Indicates whether to block or allow incoming mail from the specified IP
       * addresses. 
       */
      override fun policy(policy: String) {
        cdkBuilder.policy(policy)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty,
    ) : CdkObject(cdkObject), IpFilterProperty {
      /**
       * A single IP address or a range of IP addresses to block or allow, specified in Classless
       * Inter-Domain Routing (CIDR) notation.
       *
       * An example of a single email address is 10.0.0.1. An example of a range of IP addresses is
       * 10.0.0.1/24. For more information about CIDR notation, see [RFC
       * 2317](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2317) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr)
       */
      override fun cidr(): String = unwrap(this).getCidr()

      /**
       * Indicates whether to block or allow incoming mail from the specified IP addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy)
       */
      override fun policy(): String = unwrap(this).getPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty):
          IpFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpFilterProperty):
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty
    }
  }

  public interface FilterProperty {
    /**
     * A structure that provides the IP addresses to block or allow, and whether to block or allow
     * incoming mail from them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
     */
    public fun ipFilter(): Any

    /**
     * The name of the IP address filter. The name must meet the following requirements:.
     *
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Start and end with a letter or number.
     * * Contain 64 characters or fewer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      public fun ipFilter(ipFilter: IResolvable)

      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      public fun ipFilter(ipFilter: IpFilterProperty)

      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3bada411daede1a2b72148c9e6d98cc81b2e0cf0db3151b4bbdb6fe53944ad1")
      public fun ipFilter(ipFilter: IpFilterProperty.Builder.() -> Unit)

      /**
       * @param name The name of the IP address filter. The name must meet the following
       * requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.builder()

      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      override fun ipFilter(ipFilter: IResolvable) {
        cdkBuilder.ipFilter(ipFilter.let(IResolvable::unwrap))
      }

      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      override fun ipFilter(ipFilter: IpFilterProperty) {
        cdkBuilder.ipFilter(ipFilter.let(IpFilterProperty::unwrap))
      }

      /**
       * @param ipFilter A structure that provides the IP addresses to block or allow, and whether
       * to block or allow incoming mail from them. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3bada411daede1a2b72148c9e6d98cc81b2e0cf0db3151b4bbdb6fe53944ad1")
      override fun ipFilter(ipFilter: IpFilterProperty.Builder.() -> Unit): Unit =
          ipFilter(IpFilterProperty(ipFilter))

      /**
       * @param name The name of the IP address filter. The name must meet the following
       * requirements:.
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * A structure that provides the IP addresses to block or allow, and whether to block or allow
       * incoming mail from them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-ipfilter)
       */
      override fun ipFilter(): Any = unwrap(this).getIpFilter()

      /**
       * The name of the IP address filter. The name must meet the following requirements:.
       *
       * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
       * * Start and end with a letter or number.
       * * Contain 64 characters or fewer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html#cfn-ses-receiptfilter-filter-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty
    }
  }
}
