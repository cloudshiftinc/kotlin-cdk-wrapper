@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmguiconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPreferences`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmguiconnect.*;
 * CfnPreferencesProps cfnPreferencesProps = CfnPreferencesProps.builder()
 * .connectionRecordingPreferences(ConnectionRecordingPreferencesProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .recordingDestinations(RecordingDestinationsProperty.builder()
 * .s3Buckets(List.of(S3BucketProperty.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html)
 */
public interface CfnPreferencesProps {
  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   *
   * This includes details such as which S3 bucket recordings are stored in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
   */
  public fun connectionRecordingPreferences(): Any? =
      unwrap(this).getConnectionRecordingPreferences()

  /**
   * A builder for [CfnPreferencesProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    public fun connectionRecordingPreferences(connectionRecordingPreferences: IResolvable)

    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    public
        fun connectionRecordingPreferences(connectionRecordingPreferences: CfnPreferences.ConnectionRecordingPreferencesProperty)

    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ece8d228cc0b8b7853bcfa81434c1770f75a33deae6a0d664a45bfb146e95553")
    public
        fun connectionRecordingPreferences(connectionRecordingPreferences: CfnPreferences.ConnectionRecordingPreferencesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps.Builder =
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps.builder()

    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    override fun connectionRecordingPreferences(connectionRecordingPreferences: IResolvable) {
      cdkBuilder.connectionRecordingPreferences(connectionRecordingPreferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    override
        fun connectionRecordingPreferences(connectionRecordingPreferences: CfnPreferences.ConnectionRecordingPreferencesProperty) {
      cdkBuilder.connectionRecordingPreferences(connectionRecordingPreferences.let(CfnPreferences.ConnectionRecordingPreferencesProperty.Companion::unwrap))
    }

    /**
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region .
     * This includes details such as which S3 bucket recordings are stored in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ece8d228cc0b8b7853bcfa81434c1770f75a33deae6a0d664a45bfb146e95553")
    override
        fun connectionRecordingPreferences(connectionRecordingPreferences: CfnPreferences.ConnectionRecordingPreferencesProperty.Builder.() -> Unit):
        Unit =
        connectionRecordingPreferences(CfnPreferences.ConnectionRecordingPreferencesProperty(connectionRecordingPreferences))

    public fun build(): software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps,
  ) : CdkObject(cdkObject),
      CfnPreferencesProps {
    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     */
    override fun connectionRecordingPreferences(): Any? =
        unwrap(this).getConnectionRecordingPreferences()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPreferencesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps):
        CfnPreferencesProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPreferencesProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPreferencesProps):
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps
  }
}
