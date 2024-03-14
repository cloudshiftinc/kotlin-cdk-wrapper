package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnReceiptFilterProps {
  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
   */
  public fun filter(): Any

  /**
   * A builder for [CfnReceiptFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    public fun filter(filter: IResolvable)

    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    public fun filter(filter: CfnReceiptFilter.FilterProperty)

    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a0132114fcbc3d0c0e844b1c1140464f87f9468244eeb5486156bf8aca5e509")
    public fun filter(filter: CfnReceiptFilter.FilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptFilterProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptFilterProps.builder()

    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    override fun filter(filter: CfnReceiptFilter.FilterProperty) {
      cdkBuilder.filter(filter.let(CfnReceiptFilter.FilterProperty::unwrap))
    }

    /**
     * @param filter A data structure that describes the IP address filter to create, which consists
     * of a name, an IP address range, and whether to allow or block mail from it. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a0132114fcbc3d0c0e844b1c1140464f87f9468244eeb5486156bf8aca5e509")
    override fun filter(filter: CfnReceiptFilter.FilterProperty.Builder.() -> Unit): Unit =
        filter(CfnReceiptFilter.FilterProperty(filter))

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilterProps,
  ) : CdkObject(cdkObject), CfnReceiptFilterProps {
    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     */
    override fun filter(): Any = unwrap(this).getFilter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilterProps):
        CfnReceiptFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptFilterProps):
        software.amazon.awscdk.services.ses.CfnReceiptFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnReceiptFilterProps
  }
}
