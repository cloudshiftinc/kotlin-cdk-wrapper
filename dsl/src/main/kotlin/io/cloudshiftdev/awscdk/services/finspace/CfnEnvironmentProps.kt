package io.cloudshiftdev.awscdk.services.finspace

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEnvironmentProps {
  /**
   * (deprecated) ARNs of FinSpace Data Bundles to install.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

  /**
   * The description of the FinSpace environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The authentication mode for the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationmode)
   */
  public fun federationMode(): String? = unwrap(this).getFederationMode()

  /**
   * Configuration information when authentication mode is FEDERATED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
   */
  public fun federationParameters(): Any? = unwrap(this).getFederationParameters()

  /**
   * The KMS key id used to encrypt in the FinSpace environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the FinSpace environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-name)
   */
  public fun name(): String

  /**
   * Configuration information for the superuser.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
   */
  public fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(dataBundles: List<String>)

    /**
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(vararg dataBundles: String)

    /**
     * @param description The description of the FinSpace environment.
     */
    public fun description(description: String)

    /**
     * @param federationMode The authentication mode for the environment.
     */
    public fun federationMode(federationMode: String)

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    public fun federationParameters(federationParameters: IResolvable)

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    public
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty)

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcd8ff86bfe80472eba4ba3c2985319541cce96282d0134cf04c5da612b7024")
    public
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the FinSpace environment. 
     */
    public fun name(name: String)

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    public fun superuserParameters(superuserParameters: IResolvable)

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    public fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty)

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("833fdcba7cbd44cfeb35fd1e294fbd189cbc1a1dd6d81f03e677cbab5c1385d9")
    public
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.finspace.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.finspace.CfnEnvironmentProps.builder()

    /**
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(dataBundles: List<String>) {
      cdkBuilder.dataBundles(dataBundles)
    }

    /**
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(vararg dataBundles: String): Unit = dataBundles(dataBundles.toList())

    /**
     * @param description The description of the FinSpace environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param federationMode The authentication mode for the environment.
     */
    override fun federationMode(federationMode: String) {
      cdkBuilder.federationMode(federationMode)
    }

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    override fun federationParameters(federationParameters: IResolvable) {
      cdkBuilder.federationParameters(federationParameters.let(IResolvable::unwrap))
    }

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    override
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty) {
      cdkBuilder.federationParameters(federationParameters.let(CfnEnvironment.FederationParametersProperty::unwrap))
    }

    /**
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adcd8ff86bfe80472eba4ba3c2985319541cce96282d0134cf04c5da612b7024")
    override
        fun federationParameters(federationParameters: CfnEnvironment.FederationParametersProperty.Builder.() -> Unit):
        Unit =
        federationParameters(CfnEnvironment.FederationParametersProperty(federationParameters))

    /**
     * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the FinSpace environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    override fun superuserParameters(superuserParameters: IResolvable) {
      cdkBuilder.superuserParameters(superuserParameters.let(IResolvable::unwrap))
    }

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    override
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty) {
      cdkBuilder.superuserParameters(superuserParameters.let(CfnEnvironment.SuperuserParametersProperty::unwrap))
    }

    /**
     * @param superuserParameters Configuration information for the superuser.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("833fdcba7cbd44cfeb35fd1e294fbd189cbc1a1dd6d81f03e677cbab5c1385d9")
    override
        fun superuserParameters(superuserParameters: CfnEnvironment.SuperuserParametersProperty.Builder.() -> Unit):
        Unit = superuserParameters(CfnEnvironment.SuperuserParametersProperty(superuserParameters))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.finspace.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

    /**
     * The description of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The authentication mode for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationmode)
     */
    override fun federationMode(): String? = unwrap(this).getFederationMode()

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     */
    override fun federationParameters(): Any? = unwrap(this).getFederationParameters()

    /**
     * The KMS key id used to encrypt in the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     */
    override fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.finspace.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.finspace.CfnEnvironmentProps
  }
}
