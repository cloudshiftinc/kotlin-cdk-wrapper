@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Specific settings like the authentication protocol or the VPC components to secure access to your
 * event source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * SourceAccessConfigurationType sourceAccessConfigurationType;
 * SourceAccessConfiguration sourceAccessConfiguration = SourceAccessConfiguration.builder()
 * .type(sourceAccessConfigurationType)
 * .uri("uri")
 * .build();
 * ```
 */
public interface SourceAccessConfiguration {
  /**
   * The type of authentication protocol or the VPC components for your event source.
   *
   * For example: "SASL_SCRAM_512_AUTH".
   */
  public fun type(): SourceAccessConfigurationType

  /**
   * The value for your chosen configuration in type.
   *
   * For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
   * The exact string depends on the type.
   *
   * [Documentation](SourceAccessConfigurationType)
   */
  public fun uri(): String

  /**
   * A builder for [SourceAccessConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param type The type of authentication protocol or the VPC components for your event source. 
     * For example: "SASL_SCRAM_512_AUTH".
     */
    public fun type(type: SourceAccessConfigurationType)

    /**
     * @param uri The value for your chosen configuration in type. 
     * For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
     * The exact string depends on the type.
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.SourceAccessConfiguration.Builder
        = software.amazon.awscdk.services.lambda.SourceAccessConfiguration.builder()

    /**
     * @param type The type of authentication protocol or the VPC components for your event source. 
     * For example: "SASL_SCRAM_512_AUTH".
     */
    override fun type(type: SourceAccessConfigurationType) {
      cdkBuilder.type(type.let(SourceAccessConfigurationType.Companion::unwrap))
    }

    /**
     * @param uri The value for your chosen configuration in type. 
     * For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
     * The exact string depends on the type.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.lambda.SourceAccessConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration,
  ) : CdkObject(cdkObject), SourceAccessConfiguration {
    /**
     * The type of authentication protocol or the VPC components for your event source.
     *
     * For example: "SASL_SCRAM_512_AUTH".
     */
    override fun type(): SourceAccessConfigurationType =
        unwrap(this).getType().let(SourceAccessConfigurationType::wrap)

    /**
     * The value for your chosen configuration in type.
     *
     * For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
     * The exact string depends on the type.
     *
     * [Documentation](SourceAccessConfigurationType)
     */
    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceAccessConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration):
        SourceAccessConfiguration = CdkObjectWrappers.wrap(cdkObject) as? SourceAccessConfiguration
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfiguration):
        software.amazon.awscdk.services.lambda.SourceAccessConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.SourceAccessConfiguration
  }
}
