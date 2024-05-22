@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnBatchScramSecret cfnBatchScramSecret = CfnBatchScramSecret.Builder.create(this,
 * "MyCfnBatchScramSecret")
 * .clusterArn("clusterArn")
 * // the properties below are optional
 * .secretArnList(List.of("secretArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html)
 */
public open class CfnBatchScramSecret(
  cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecret,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBatchScramSecretProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnBatchScramSecret(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBatchScramSecretProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBatchScramSecretProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBatchScramSecretProps(props)
  )

  /**
   *
   */
  public open fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   *
   */
  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()

  /**
   *
   */
  public open fun secretArnList(`value`: List<String>) {
    unwrap(this).setSecretArnList(`value`)
  }

  /**
   *
   */
  public open fun secretArnList(vararg `value`: String): Unit = secretArnList(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnBatchScramSecret].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     * @param clusterArn 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList 
     */
    public fun secretArnList(secretArnList: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList 
     */
    public fun secretArnList(vararg secretArnList: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnBatchScramSecret.Builder =
        software.amazon.awscdk.services.msk.CfnBatchScramSecret.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-clusterarn)
     * @param clusterArn 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList 
     */
    override fun secretArnList(secretArnList: List<String>) {
      cdkBuilder.secretArnList(secretArnList)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-batchscramsecret.html#cfn-msk-batchscramsecret-secretarnlist)
     * @param secretArnList 
     */
    override fun secretArnList(vararg secretArnList: String): Unit =
        secretArnList(secretArnList.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnBatchScramSecret = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnBatchScramSecret.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBatchScramSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBatchScramSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecret):
        CfnBatchScramSecret = CfnBatchScramSecret(cdkObject)

    internal fun unwrap(wrapped: CfnBatchScramSecret):
        software.amazon.awscdk.services.msk.CfnBatchScramSecret = wrapped.cdkObject as
        software.amazon.awscdk.services.msk.CfnBatchScramSecret
  }
}
