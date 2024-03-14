package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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
      cdkBuilder.type(type.let(SourceAccessConfigurationType::unwrap))
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration,
  ) : SourceAccessConfiguration {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceAccessConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration):
        SourceAccessConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfiguration):
        software.amazon.awscdk.services.lambda.SourceAccessConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
