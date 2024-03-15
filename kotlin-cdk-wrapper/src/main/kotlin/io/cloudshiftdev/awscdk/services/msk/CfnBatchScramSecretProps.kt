@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnBatchScramSecret`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnBatchScramSecretProps cfnBatchScramSecretProps = CfnBatchScramSecretProps.builder()
 * .clusterArn("clusterArn")
 * // the properties below are optional
 * .secretArnList(List.of("secretArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
 */
public interface CfnBatchScramSecretProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
   */
  public fun clusterArn(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
   */
  public fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()

  /**
   * A builder for [CfnBatchScramSecretProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterArn the value to be set. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param secretArnList the value to be set.
     */
    public fun secretArnList(secretArnList: List<String>)

    /**
     * @param secretArnList the value to be set.
     */
    public fun secretArnList(vararg secretArnList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps.Builder =
        software.amazon.awscdk.services.msk.CfnBatchScramSecretProps.builder()

    /**
     * @param clusterArn the value to be set. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param secretArnList the value to be set.
     */
    override fun secretArnList(secretArnList: List<String>) {
      cdkBuilder.secretArnList(secretArnList)
    }

    /**
     * @param secretArnList the value to be set.
     */
    override fun secretArnList(vararg secretArnList: String): Unit =
        secretArnList(secretArnList.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnBatchScramSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps,
  ) : CdkObject(cdkObject), CfnBatchScramSecretProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     */
    override fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBatchScramSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps):
        CfnBatchScramSecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBatchScramSecretProps):
        software.amazon.awscdk.services.msk.CfnBatchScramSecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
  }
}
