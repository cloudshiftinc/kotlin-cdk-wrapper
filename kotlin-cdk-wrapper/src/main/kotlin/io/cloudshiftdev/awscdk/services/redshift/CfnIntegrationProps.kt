@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
 * .sourceArn("sourceArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .integrationName("integrationName")
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html)
 */
public interface CfnIntegrationProps {
  /**
   * The encryption context for the integration.
   *
   * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
   * Management Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * The name of the integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-integrationname)
   */
  public fun integrationName(): String? = unwrap(this).getIntegrationName()

  /**
   * The AWS Key Management Service ( AWS KMS) key identifier for the key used to encrypt the
   * integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of the database used as the source for replication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-sourcearn)
   */
  public fun sourceArn(): String

  /**
   * The list of tags associated with the integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
   * replication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext The encryption context for the integration.
     * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
     * Management Service Developer Guide* .
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param additionalEncryptionContext The encryption context for the integration.
     * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
     * Management Service Developer Guide* .
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param integrationName The name of the integration.
     */
    public fun integrationName(integrationName: String)

    /**
     * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key identifier for the key used to
     * encrypt the integration.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the database used as the source for
     * replication. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * @param tags The list of tags associated with the integration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tags associated with the integration.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArn The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use
     * as the target for replication. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.redshift.CfnIntegrationProps.builder()

    /**
     * @param additionalEncryptionContext The encryption context for the integration.
     * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
     * Management Service Developer Guide* .
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param additionalEncryptionContext The encryption context for the integration.
     * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
     * Management Service Developer Guide* .
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param integrationName The name of the integration.
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key identifier for the key used to
     * encrypt the integration.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the database used as the source for
     * replication. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param tags The list of tags associated with the integration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of tags associated with the integration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArn The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use
     * as the target for replication. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshift.CfnIntegrationProps,
  ) : CdkObject(cdkObject),
      CfnIntegrationProps {
    /**
     * The encryption context for the integration.
     *
     * For more information, see [Encryption context](https://docs.aws.amazon.com/) in the *AWS Key
     * Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-integrationname)
     */
    override fun integrationName(): String? = unwrap(this).getIntegrationName()

    /**
     * The AWS Key Management Service ( AWS KMS) key identifier for the key used to encrypt the
     * integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-sourcearn)
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()

    /**
     * The list of tags associated with the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
     * replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnIntegrationProps):
        CfnIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.redshift.CfnIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnIntegrationProps
  }
}
