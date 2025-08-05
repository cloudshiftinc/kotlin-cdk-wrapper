@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties for defining a `CfnTransactionSearchConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnTransactionSearchConfigProps cfnTransactionSearchConfigProps =
 * CfnTransactionSearchConfigProps.builder()
 * .indexingPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html)
 */
public interface CfnTransactionSearchConfigProps {
  /**
   * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html#cfn-xray-transactionsearchconfig-indexingpercentage)
   */
  public fun indexingPercentage(): Number? = unwrap(this).getIndexingPercentage()

  /**
   * A builder for [CfnTransactionSearchConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param indexingPercentage Determines the percentage of traces indexed from CloudWatch Logs to
     * X-Ray.
     */
    public fun indexingPercentage(indexingPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps.Builder =
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps.builder()

    /**
     * @param indexingPercentage Determines the percentage of traces indexed from CloudWatch Logs to
     * X-Ray.
     */
    override fun indexingPercentage(indexingPercentage: Number) {
      cdkBuilder.indexingPercentage(indexingPercentage)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps,
  ) : CdkObject(cdkObject),
      CfnTransactionSearchConfigProps {
    /**
     * Determines the percentage of traces indexed from CloudWatch Logs to X-Ray.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-transactionsearchconfig.html#cfn-xray-transactionsearchconfig-indexingpercentage)
     */
    override fun indexingPercentage(): Number? = unwrap(this).getIndexingPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransactionSearchConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps):
        CfnTransactionSearchConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransactionSearchConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransactionSearchConfigProps):
        software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps
  }
}
