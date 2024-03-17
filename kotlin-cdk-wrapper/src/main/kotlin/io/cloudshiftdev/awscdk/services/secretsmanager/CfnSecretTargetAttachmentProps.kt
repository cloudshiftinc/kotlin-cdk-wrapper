@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSecretTargetAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * CfnSecretTargetAttachmentProps cfnSecretTargetAttachmentProps =
 * CfnSecretTargetAttachmentProps.builder()
 * .secretId("secretId")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
 */
public interface CfnSecretTargetAttachmentProps {
  /**
   * The ARN or name of the secret.
   *
   * To reference a secret also created in this template, use the see
   * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
   * function with the secret's logical ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-secretid)
   */
  public fun secretId(): String

  /**
   * The ID of the database or cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targetid)
   */
  public fun targetId(): String

  /**
   * A string that defines the type of service or database associated with the secret.
   *
   * This value instructs Secrets Manager how to update the secret with the details of the service
   * or database. This value must be one of the following:
   *
   * * AWS::RDS::DBInstance
   * * AWS::RDS::DBCluster
   * * AWS::Redshift::Cluster
   * * AWS::DocDB::DBInstance
   * * AWS::DocDB::DBCluster
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targettype)
   */
  public fun targetType(): String

  /**
   * A builder for [CfnSecretTargetAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param secretId The ARN or name of the secret. 
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     */
    public fun secretId(secretId: String)

    /**
     * @param targetId The ID of the database or cluster. 
     */
    public fun targetId(targetId: String)

    /**
     * @param targetType A string that defines the type of service or database associated with the
     * secret. 
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     *
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.builder()

    /**
     * @param secretId The ARN or name of the secret. 
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    /**
     * @param targetId The ID of the database or cluster. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * @param targetType A string that defines the type of service or database associated with the
     * secret. 
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     *
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build():
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps,
  ) : CdkObject(cdkObject), CfnSecretTargetAttachmentProps {
    /**
     * The ARN or name of the secret.
     *
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-secretid)
     */
    override fun secretId(): String = unwrap(this).getSecretId()

    /**
     * The ID of the database or cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targetid)
     */
    override fun targetId(): String = unwrap(this).getTargetId()

    /**
     * A string that defines the type of service or database associated with the secret.
     *
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     *
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targettype)
     */
    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecretTargetAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps):
        CfnSecretTargetAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSecretTargetAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecretTargetAttachmentProps):
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
  }
}
