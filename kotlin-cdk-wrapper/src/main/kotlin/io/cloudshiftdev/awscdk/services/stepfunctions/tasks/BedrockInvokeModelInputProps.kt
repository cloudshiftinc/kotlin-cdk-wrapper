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
 * Location to retrieve the input data, prior to calling Bedrock InvokeModel.
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
public interface BedrockInvokeModelInputProps {
  /**
   * The source location where the API response is written.
   *
   * This field can be used to specify s3 URI in the form of token
   *
   * Default: - The API response body is returned in the result.
   */
  public fun s3InputUri(): String? = unwrap(this).getS3InputUri()

  /**
   * S3 object to retrieve the input data from.
   *
   * If the S3 location is not set, then the Body must be set.
   *
   * Default: - Input data is retrieved from the `body` field
   */
  public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

  /**
   * A builder for [BedrockInvokeModelInputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3InputUri The source location where the API response is written.
     * This field can be used to specify s3 URI in the form of token
     */
    public fun s3InputUri(s3InputUri: String)

    /**
     * @param s3Location S3 object to retrieve the input data from.
     * If the S3 location is not set, then the Body must be set.
     */
    public fun s3Location(s3Location: Location)

    /**
     * @param s3Location S3 object to retrieve the input data from.
     * If the S3 location is not set, then the Body must be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b187a28fa1b63eb5484ceff47fbc536aae7c8a9ff0f76477660323bf8a8a376")
    public fun s3Location(s3Location: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps.builder()

    /**
     * @param s3InputUri The source location where the API response is written.
     * This field can be used to specify s3 URI in the form of token
     */
    override fun s3InputUri(s3InputUri: String) {
      cdkBuilder.s3InputUri(s3InputUri)
    }

    /**
     * @param s3Location S3 object to retrieve the input data from.
     * If the S3 location is not set, then the Body must be set.
     */
    override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location.Companion::unwrap))
    }

    /**
     * @param s3Location S3 object to retrieve the input data from.
     * If the S3 location is not set, then the Body must be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b187a28fa1b63eb5484ceff47fbc536aae7c8a9ff0f76477660323bf8a8a376")
    override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps,
  ) : CdkObject(cdkObject),
      BedrockInvokeModelInputProps {
    /**
     * The source location where the API response is written.
     *
     * This field can be used to specify s3 URI in the form of token
     *
     * Default: - The API response body is returned in the result.
     */
    override fun s3InputUri(): String? = unwrap(this).getS3InputUri()

    /**
     * S3 object to retrieve the input data from.
     *
     * If the S3 location is not set, then the Body must be set.
     *
     * Default: - Input data is retrieved from the `body` field
     */
    override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelInputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps):
        BedrockInvokeModelInputProps = CdkObjectWrappers.wrap(cdkObject) as?
        BedrockInvokeModelInputProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BedrockInvokeModelInputProps):
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps
  }
}
