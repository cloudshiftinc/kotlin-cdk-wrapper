@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorscep

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnChallenge`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
 * CfnChallengeProps cfnChallengeProps = CfnChallengeProps.builder()
 * .connectorArn("connectorArn")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html)
 */
public interface CfnChallengeProps {
  /**
   * The Amazon Resource Name (ARN) of the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-connectorarn)
   */
  public fun connectorArn(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnChallengeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
     */
    public fun connectorArn(connectorArn: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps.Builder =
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps.builder()

    /**
     * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps,
  ) : CdkObject(cdkObject),
      CfnChallengeProps {
    /**
     * The Amazon Resource Name (ARN) of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-connectorarn)
     */
    override fun connectorArn(): String = unwrap(this).getConnectorArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChallengeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps):
        CfnChallengeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChallengeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChallengeProps):
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps
  }
}
