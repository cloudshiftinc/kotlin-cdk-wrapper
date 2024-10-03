@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Location where the Bedrock InvokeModel API response is written.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * FoundationModel model = FoundationModel.fromFoundationModelId(this, "Model",
 * FoundationModelIdentifier.AMAZON_TITAN_TEXT_G1_EXPRESS_V1);
 * BedrockInvokeModel task = BedrockInvokeModel.Builder.create(this, "Prompt Model")
 * .model(model)
 * .input(BedrockInvokeModelInputProps.builder().s3InputUri(JsonPath.stringAt("$.prompt")).build())
 * .output(BedrockInvokeModelOutputProps.builder().s3OutputUri(JsonPath.stringAt("$.prompt")).build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-bedrock.html)
 */
public interface BedrockInvokeModelOutputProps {
  /**
   * S3 object where the Bedrock InvokeModel API response is written.
   *
   * If you specify this field, the API response body is replaced with
   * a reference to the Amazon S3 location of the original output.
   *
   * Default: - Response body is returned in the task result
   */
  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  /**
   * The destination location where the API response is written.
   *
   * This field can be used to specify s3 URI in the form of token
   *
   * Default: - The API response body is returned in the result.
   */
  public fun s3OutputUri(): String? = unwrap(this).getS3OutputUri()

  /**
   * A builder for [BedrockInvokeModelOutputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written.
     * If you specify this field, the API response body is replaced with
     * a reference to the Amazon S3 location of the original output.
     */
    public fun s3Location(s3Location: Location)

    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written.
     * If you specify this field, the API response body is replaced with
     * a reference to the Amazon S3 location of the original output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)

    /**
     * @param s3OutputUri The destination location where the API response is written.
     * This field can be used to specify s3 URI in the form of token
     */
    public fun s3OutputUri(s3OutputUri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps.builder()

    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written.
     * If you specify this field, the API response body is replaced with
     * a reference to the Amazon S3 location of the original output.
     */
    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location.Companion::unwrap))
    }

    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written.
     * If you specify this field, the API response body is replaced with
     * a reference to the Amazon S3 location of the original output.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    /**
     * @param s3OutputUri The destination location where the API response is written.
     * This field can be used to specify s3 URI in the form of token
     */
    override fun s3OutputUri(s3OutputUri: String) {
      cdkBuilder.s3OutputUri(s3OutputUri)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps,
  ) : CdkObject(cdkObject),
      BedrockInvokeModelOutputProps {
    /**
     * S3 object where the Bedrock InvokeModel API response is written.
     *
     * If you specify this field, the API response body is replaced with
     * a reference to the Amazon S3 location of the original output.
     *
     * Default: - Response body is returned in the task result
     */
    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

    /**
     * The destination location where the API response is written.
     *
     * This field can be used to specify s3 URI in the form of token
     *
     * Default: - The API response body is returned in the result.
     */
    override fun s3OutputUri(): String? = unwrap(this).getS3OutputUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps):
        BedrockInvokeModelOutputProps = CdkObjectWrappers.wrap(cdkObject) as?
        BedrockInvokeModelOutputProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelOutputProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps
  }
}
