package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironmentProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The timestamp of when an environment profile was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon DataZone user who created the environment profile.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The identifier of the Amazon DataZone domain in which the environment profile exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of a blueprint with which an environment profile is created.
   */
  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  /**
   * The identifier of the environment profile.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of a project in which an environment profile exists.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The timestamp of when the environment profile was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The identifier of an AWS account in which an environment profile exists.
   */
  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  /**
   * The identifier of an AWS account in which an environment profile exists.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * The AWS Region in which an environment profile exists.
   */
  public open fun awsAccountRegion(): String = unwrap(this).getAwsAccountRegion()

  /**
   * The AWS Region in which an environment profile exists.
   */
  public open fun awsAccountRegion(`value`: String) {
    unwrap(this).setAwsAccountRegion(`value`)
  }

  /**
   * The description of the environment profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the environment profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of the Amazon DataZone domain in which the environment profile exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of the Amazon DataZone domain in which the environment profile exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The identifier of a blueprint with which an environment profile is created.
   */
  public open fun environmentBlueprintIdentifier(): String =
      unwrap(this).getEnvironmentBlueprintIdentifier()

  /**
   * The identifier of a blueprint with which an environment profile is created.
   */
  public open fun environmentBlueprintIdentifier(`value`: String) {
    unwrap(this).setEnvironmentBlueprintIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the environment profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the environment profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The identifier of a project in which an environment profile exists.
   */
  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  /**
   * The identifier of a project in which an environment profile exists.
   */
  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  /**
   * The user parameters of this Amazon DataZone environment profile.
   */
  public open fun userParameters(): Any? = unwrap(this).getUserParameters()

  /**
   * The user parameters of this Amazon DataZone environment profile.
   */
  public open fun userParameters(`value`: IResolvable) {
    unwrap(this).setUserParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The user parameters of this Amazon DataZone environment profile.
   */
  public open fun userParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserParameters(__idx_ac66f0)
  }

  /**
   * The user parameters of this Amazon DataZone environment profile.
   */
  public open fun userParameters(vararg __idx_ac66f0: Any): Unit =
      userParameters(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnEnvironmentProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of an AWS account in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountid)
     * @param awsAccountId The identifier of an AWS account in which an environment profile exists. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * The AWS Region in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountregion)
     * @param awsAccountRegion The AWS Region in which an environment profile exists. 
     */
    public fun awsAccountRegion(awsAccountRegion: String)

    /**
     * The description of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-description)
     * @param description The description of the environment profile. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon DataZone domain in which the environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * profile exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The identifier of a blueprint with which an environment profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-environmentblueprintidentifier)
     * @param environmentBlueprintIdentifier The identifier of a blueprint with which an environment
     * profile is created. 
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    /**
     * The name of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-name)
     * @param name The name of the environment profile. 
     */
    public fun name(name: String)

    /**
     * The identifier of a project in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-projectidentifier)
     * @param projectIdentifier The identifier of a project in which an environment profile exists. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    public fun userParameters(userParameters: IResolvable)

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    public fun userParameters(userParameters: List<Any>)

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.Builder.create(scope, id)

    /**
     * The identifier of an AWS account in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountid)
     * @param awsAccountId The identifier of an AWS account in which an environment profile exists. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The AWS Region in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-awsaccountregion)
     * @param awsAccountRegion The AWS Region in which an environment profile exists. 
     */
    override fun awsAccountRegion(awsAccountRegion: String) {
      cdkBuilder.awsAccountRegion(awsAccountRegion)
    }

    /**
     * The description of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-description)
     * @param description The description of the environment profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon DataZone domain in which the environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which the environment
     * profile exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The identifier of a blueprint with which an environment profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-environmentblueprintidentifier)
     * @param environmentBlueprintIdentifier The identifier of a blueprint with which an environment
     * profile is created. 
     */
    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * The name of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-name)
     * @param name The name of the environment profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The identifier of a project in which an environment profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-projectidentifier)
     * @param projectIdentifier The identifier of a project in which an environment profile exists. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    /**
     * The user parameters of this Amazon DataZone environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentprofile.html#cfn-datazone-environmentprofile-userparameters)
     * @param userParameters The user parameters of this Amazon DataZone environment profile. 
     */
    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile):
        CfnEnvironmentProfile = CfnEnvironmentProfile(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProfile):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfile = wrapped.cdkObject
  }

  public interface EnvironmentParameterProperty {
    /**
     * The name specified in the environment parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html#cfn-datazone-environmentprofile-environmentparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the environment profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html#cfn-datazone-environmentprofile-environmentparameter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name specified in the environment parameter.
       */
      public fun name(name: String)

      /**
       * @param value The value of the environment profile.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty.builder()

      /**
       * @param name The name specified in the environment parameter.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the environment profile.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty,
    ) : CdkObject(cdkObject), EnvironmentParameterProperty {
      /**
       * The name specified in the environment parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html#cfn-datazone-environmentprofile-environmentparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the environment profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentprofile-environmentparameter.html#cfn-datazone-environmentprofile-environmentparameter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty):
          EnvironmentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty
    }
  }
}
