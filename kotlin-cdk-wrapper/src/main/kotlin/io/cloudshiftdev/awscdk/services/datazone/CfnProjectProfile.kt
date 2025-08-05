@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::DataZone::ProjectProfile Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectProfile cfnProjectProfile = CfnProjectProfile.Builder.create(this,
 * "MyCfnProjectProfile")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .domainIdentifier("domainIdentifier")
 * .domainUnitIdentifier("domainUnitIdentifier")
 * .environmentConfigurations(List.of(EnvironmentConfigurationProperty.builder()
 * .awsRegion(RegionProperty.builder()
 * .regionName("regionName")
 * .build())
 * .environmentBlueprintId("environmentBlueprintId")
 * .name("name")
 * // the properties below are optional
 * .awsAccount(AwsAccountProperty.builder()
 * .awsAccountId("awsAccountId")
 * .build())
 * .configurationParameters(EnvironmentConfigurationParametersDetailsProperty.builder()
 * .parameterOverrides(List.of(EnvironmentConfigurationParameterProperty.builder()
 * .isEditable(false)
 * .name("name")
 * .value("value")
 * .build()))
 * .resolvedParameters(List.of(EnvironmentConfigurationParameterProperty.builder()
 * .isEditable(false)
 * .name("name")
 * .value("value")
 * .build()))
 * .ssmPath("ssmPath")
 * .build())
 * .deploymentMode("deploymentMode")
 * .deploymentOrder(123)
 * .description("description")
 * .id("id")
 * .build()))
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html)
 */
public open class CfnProjectProfile(
  cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProfileProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnProjectProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProjectProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProfileProps(props)
  )

  /**
   * The timestamp of when the project profile was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The user who created the project profile.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The domain ID of the project profile.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The domain unit ID of the project profile.
   */
  public open fun attrDomainUnitId(): String = unwrap(this).getAttrDomainUnitId()

  /**
   * The ID of the project profile.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The timestamp at which a project profile was last updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The description of the project profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the project profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

  /**
   *
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   *
   */
  public open fun domainUnitIdentifier(): String? = unwrap(this).getDomainUnitIdentifier()

  /**
   *
   */
  public open fun domainUnitIdentifier(`value`: String) {
    unwrap(this).setDomainUnitIdentifier(`value`)
  }

  /**
   *
   */
  public open fun environmentConfigurations(): Any? = unwrap(this).getEnvironmentConfigurations()

  /**
   *
   */
  public open fun environmentConfigurations(`value`: IResolvable) {
    unwrap(this).setEnvironmentConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun environmentConfigurations(`value`: List<Any>) {
    unwrap(this).setEnvironmentConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun environmentConfigurations(vararg `value`: Any): Unit =
      environmentConfigurations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of a project profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a project profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The status of a project profile.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of a project profile.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnProjectProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-description)
     * @param description The description of the project profile. 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainidentifier)
     * @param domainIdentifier 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainunitidentifier)
     * @param domainUnitIdentifier 
     */
    public fun domainUnitIdentifier(domainUnitIdentifier: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    public fun environmentConfigurations(environmentConfigurations: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    public fun environmentConfigurations(environmentConfigurations: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    public fun environmentConfigurations(vararg environmentConfigurations: Any)

    /**
     * The name of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-name)
     * @param name The name of a project profile. 
     */
    public fun name(name: String)

    /**
     * The status of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-status)
     * @param status The status of a project profile. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectProfile.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectProfile.Builder.create(scope, id)

    /**
     * The description of the project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-description)
     * @param description The description of the project profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainidentifier)
     * @param domainIdentifier 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-domainunitidentifier)
     * @param domainUnitIdentifier 
     */
    override fun domainUnitIdentifier(domainUnitIdentifier: String) {
      cdkBuilder.domainUnitIdentifier(domainUnitIdentifier)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    override fun environmentConfigurations(environmentConfigurations: IResolvable) {
      cdkBuilder.environmentConfigurations(environmentConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    override fun environmentConfigurations(environmentConfigurations: List<Any>) {
      cdkBuilder.environmentConfigurations(environmentConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-environmentconfigurations)
     * @param environmentConfigurations 
     */
    override fun environmentConfigurations(vararg environmentConfigurations: Any): Unit =
        environmentConfigurations(environmentConfigurations.toList())

    /**
     * The name of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-name)
     * @param name The name of a project profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The status of a project profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectprofile.html#cfn-datazone-projectprofile-status)
     * @param status The status of a project profile. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnProjectProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProjectProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProjectProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile):
        CfnProjectProfile = CfnProjectProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProfile):
        software.amazon.awscdk.services.datazone.CfnProjectProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnProjectProfile
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AwsAccountProperty awsAccountProperty = AwsAccountProperty.builder()
   * .awsAccountId("awsAccountId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-awsaccount.html)
   */
  public interface AwsAccountProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-awsaccount.html#cfn-datazone-projectprofile-awsaccount-awsaccountid)
     */
    public fun awsAccountId(): String

    /**
     * A builder for [AwsAccountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountId the value to be set. 
       */
      public fun awsAccountId(awsAccountId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty.builder()

      /**
       * @param awsAccountId the value to be set. 
       */
      override fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty,
    ) : CdkObject(cdkObject),
        AwsAccountProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-awsaccount.html#cfn-datazone-projectprofile-awsaccount-awsaccountid)
       */
      override fun awsAccountId(): String = unwrap(this).getAwsAccountId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsAccountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty):
          AwsAccountProperty = CdkObjectWrappers.wrap(cdkObject) as? AwsAccountProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsAccountProperty):
          software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectProfile.AwsAccountProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * EnvironmentConfigurationParameterProperty environmentConfigurationParameterProperty =
   * EnvironmentConfigurationParameterProperty.builder()
   * .isEditable(false)
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html)
   */
  public interface EnvironmentConfigurationParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-iseditable)
     */
    public fun isEditable(): Any? = unwrap(this).getIsEditable()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentConfigurationParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isEditable the value to be set.
       */
      public fun isEditable(isEditable: Boolean)

      /**
       * @param isEditable the value to be set.
       */
      public fun isEditable(isEditable: IResolvable)

      /**
       * @param name the value to be set.
       */
      public fun name(name: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty.builder()

      /**
       * @param isEditable the value to be set.
       */
      override fun isEditable(isEditable: Boolean) {
        cdkBuilder.isEditable(isEditable)
      }

      /**
       * @param isEditable the value to be set.
       */
      override fun isEditable(isEditable: IResolvable) {
        cdkBuilder.isEditable(isEditable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param name the value to be set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty,
    ) : CdkObject(cdkObject),
        EnvironmentConfigurationParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-iseditable)
       */
      override fun isEditable(): Any? = unwrap(this).getIsEditable()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparameter.html#cfn-datazone-projectprofile-environmentconfigurationparameter-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EnvironmentConfigurationParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty):
          EnvironmentConfigurationParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentConfigurationParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentConfigurationParameterProperty):
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParameterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * EnvironmentConfigurationParametersDetailsProperty
   * environmentConfigurationParametersDetailsProperty =
   * EnvironmentConfigurationParametersDetailsProperty.builder()
   * .parameterOverrides(List.of(EnvironmentConfigurationParameterProperty.builder()
   * .isEditable(false)
   * .name("name")
   * .value("value")
   * .build()))
   * .resolvedParameters(List.of(EnvironmentConfigurationParameterProperty.builder()
   * .isEditable(false)
   * .name("name")
   * .value("value")
   * .build()))
   * .ssmPath("ssmPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html)
   */
  public interface EnvironmentConfigurationParametersDetailsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-parameteroverrides)
     */
    public fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-resolvedparameters)
     */
    public fun resolvedParameters(): Any? = unwrap(this).getResolvedParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-ssmpath)
     */
    public fun ssmPath(): String? = unwrap(this).getSsmPath()

    /**
     * A builder for [EnvironmentConfigurationParametersDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterOverrides the value to be set.
       */
      public fun parameterOverrides(parameterOverrides: IResolvable)

      /**
       * @param parameterOverrides the value to be set.
       */
      public fun parameterOverrides(parameterOverrides: List<Any>)

      /**
       * @param parameterOverrides the value to be set.
       */
      public fun parameterOverrides(vararg parameterOverrides: Any)

      /**
       * @param resolvedParameters the value to be set.
       */
      public fun resolvedParameters(resolvedParameters: IResolvable)

      /**
       * @param resolvedParameters the value to be set.
       */
      public fun resolvedParameters(resolvedParameters: List<Any>)

      /**
       * @param resolvedParameters the value to be set.
       */
      public fun resolvedParameters(vararg resolvedParameters: Any)

      /**
       * @param ssmPath the value to be set.
       */
      public fun ssmPath(ssmPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty.builder()

      /**
       * @param parameterOverrides the value to be set.
       */
      override fun parameterOverrides(parameterOverrides: IResolvable) {
        cdkBuilder.parameterOverrides(parameterOverrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameterOverrides the value to be set.
       */
      override fun parameterOverrides(parameterOverrides: List<Any>) {
        cdkBuilder.parameterOverrides(parameterOverrides.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param parameterOverrides the value to be set.
       */
      override fun parameterOverrides(vararg parameterOverrides: Any): Unit =
          parameterOverrides(parameterOverrides.toList())

      /**
       * @param resolvedParameters the value to be set.
       */
      override fun resolvedParameters(resolvedParameters: IResolvable) {
        cdkBuilder.resolvedParameters(resolvedParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resolvedParameters the value to be set.
       */
      override fun resolvedParameters(resolvedParameters: List<Any>) {
        cdkBuilder.resolvedParameters(resolvedParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resolvedParameters the value to be set.
       */
      override fun resolvedParameters(vararg resolvedParameters: Any): Unit =
          resolvedParameters(resolvedParameters.toList())

      /**
       * @param ssmPath the value to be set.
       */
      override fun ssmPath(ssmPath: String) {
        cdkBuilder.ssmPath(ssmPath)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty,
    ) : CdkObject(cdkObject),
        EnvironmentConfigurationParametersDetailsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-parameteroverrides)
       */
      override fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-resolvedparameters)
       */
      override fun resolvedParameters(): Any? = unwrap(this).getResolvedParameters()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfigurationparametersdetails.html#cfn-datazone-projectprofile-environmentconfigurationparametersdetails-ssmpath)
       */
      override fun ssmPath(): String? = unwrap(this).getSsmPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EnvironmentConfigurationParametersDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty):
          EnvironmentConfigurationParametersDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentConfigurationParametersDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentConfigurationParametersDetailsProperty):
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationParametersDetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * EnvironmentConfigurationProperty environmentConfigurationProperty =
   * EnvironmentConfigurationProperty.builder()
   * .awsRegion(RegionProperty.builder()
   * .regionName("regionName")
   * .build())
   * .environmentBlueprintId("environmentBlueprintId")
   * .name("name")
   * // the properties below are optional
   * .awsAccount(AwsAccountProperty.builder()
   * .awsAccountId("awsAccountId")
   * .build())
   * .configurationParameters(EnvironmentConfigurationParametersDetailsProperty.builder()
   * .parameterOverrides(List.of(EnvironmentConfigurationParameterProperty.builder()
   * .isEditable(false)
   * .name("name")
   * .value("value")
   * .build()))
   * .resolvedParameters(List.of(EnvironmentConfigurationParameterProperty.builder()
   * .isEditable(false)
   * .name("name")
   * .value("value")
   * .build()))
   * .ssmPath("ssmPath")
   * .build())
   * .deploymentMode("deploymentMode")
   * .deploymentOrder(123)
   * .description("description")
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html)
   */
  public interface EnvironmentConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-awsaccount)
     */
    public fun awsAccount(): Any? = unwrap(this).getAwsAccount()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-awsregion)
     */
    public fun awsRegion(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-configurationparameters)
     */
    public fun configurationParameters(): Any? = unwrap(this).getConfigurationParameters()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-deploymentmode)
     */
    public fun deploymentMode(): String? = unwrap(this).getDeploymentMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-deploymentorder)
     */
    public fun deploymentOrder(): Number? = unwrap(this).getDeploymentOrder()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-environmentblueprintid)
     */
    public fun environmentBlueprintId(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-name)
     */
    public fun name(): String

    /**
     * A builder for [EnvironmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccount the value to be set.
       */
      public fun awsAccount(awsAccount: IResolvable)

      /**
       * @param awsAccount the value to be set.
       */
      public fun awsAccount(awsAccount: AwsAccountProperty)

      /**
       * @param awsAccount the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f620af7ed06c343c7e1df5744337b47bb465d05bc35d342fb1f7ac09746b11bd")
      public fun awsAccount(awsAccount: AwsAccountProperty.Builder.() -> Unit)

      /**
       * @param awsRegion the value to be set. 
       */
      public fun awsRegion(awsRegion: IResolvable)

      /**
       * @param awsRegion the value to be set. 
       */
      public fun awsRegion(awsRegion: RegionProperty)

      /**
       * @param awsRegion the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03f855d6ed36f1223642abc5a9d70b1ab688303aeb9ca8c612300d226780c96")
      public fun awsRegion(awsRegion: RegionProperty.Builder.() -> Unit)

      /**
       * @param configurationParameters the value to be set.
       */
      public fun configurationParameters(configurationParameters: IResolvable)

      /**
       * @param configurationParameters the value to be set.
       */
      public
          fun configurationParameters(configurationParameters: EnvironmentConfigurationParametersDetailsProperty)

      /**
       * @param configurationParameters the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf7978a491b9ac2c431fdfe3f3e2efe59fd4c2dd0d9c48b15033885c00f5490e")
      public
          fun configurationParameters(configurationParameters: EnvironmentConfigurationParametersDetailsProperty.Builder.() -> Unit)

      /**
       * @param deploymentMode the value to be set.
       */
      public fun deploymentMode(deploymentMode: String)

      /**
       * @param deploymentOrder the value to be set.
       */
      public fun deploymentOrder(deploymentOrder: Number)

      /**
       * @param description the value to be set.
       */
      public fun description(description: String)

      /**
       * @param environmentBlueprintId the value to be set. 
       */
      public fun environmentBlueprintId(environmentBlueprintId: String)

      /**
       * @param id the value to be set.
       */
      public fun id(id: String)

      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty.builder()

      /**
       * @param awsAccount the value to be set.
       */
      override fun awsAccount(awsAccount: IResolvable) {
        cdkBuilder.awsAccount(awsAccount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsAccount the value to be set.
       */
      override fun awsAccount(awsAccount: AwsAccountProperty) {
        cdkBuilder.awsAccount(awsAccount.let(AwsAccountProperty.Companion::unwrap))
      }

      /**
       * @param awsAccount the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f620af7ed06c343c7e1df5744337b47bb465d05bc35d342fb1f7ac09746b11bd")
      override fun awsAccount(awsAccount: AwsAccountProperty.Builder.() -> Unit): Unit =
          awsAccount(AwsAccountProperty(awsAccount))

      /**
       * @param awsRegion the value to be set. 
       */
      override fun awsRegion(awsRegion: IResolvable) {
        cdkBuilder.awsRegion(awsRegion.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsRegion the value to be set. 
       */
      override fun awsRegion(awsRegion: RegionProperty) {
        cdkBuilder.awsRegion(awsRegion.let(RegionProperty.Companion::unwrap))
      }

      /**
       * @param awsRegion the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03f855d6ed36f1223642abc5a9d70b1ab688303aeb9ca8c612300d226780c96")
      override fun awsRegion(awsRegion: RegionProperty.Builder.() -> Unit): Unit =
          awsRegion(RegionProperty(awsRegion))

      /**
       * @param configurationParameters the value to be set.
       */
      override fun configurationParameters(configurationParameters: IResolvable) {
        cdkBuilder.configurationParameters(configurationParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configurationParameters the value to be set.
       */
      override
          fun configurationParameters(configurationParameters: EnvironmentConfigurationParametersDetailsProperty) {
        cdkBuilder.configurationParameters(configurationParameters.let(EnvironmentConfigurationParametersDetailsProperty.Companion::unwrap))
      }

      /**
       * @param configurationParameters the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf7978a491b9ac2c431fdfe3f3e2efe59fd4c2dd0d9c48b15033885c00f5490e")
      override
          fun configurationParameters(configurationParameters: EnvironmentConfigurationParametersDetailsProperty.Builder.() -> Unit):
          Unit =
          configurationParameters(EnvironmentConfigurationParametersDetailsProperty(configurationParameters))

      /**
       * @param deploymentMode the value to be set.
       */
      override fun deploymentMode(deploymentMode: String) {
        cdkBuilder.deploymentMode(deploymentMode)
      }

      /**
       * @param deploymentOrder the value to be set.
       */
      override fun deploymentOrder(deploymentOrder: Number) {
        cdkBuilder.deploymentOrder(deploymentOrder)
      }

      /**
       * @param description the value to be set.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param environmentBlueprintId the value to be set. 
       */
      override fun environmentBlueprintId(environmentBlueprintId: String) {
        cdkBuilder.environmentBlueprintId(environmentBlueprintId)
      }

      /**
       * @param id the value to be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty,
    ) : CdkObject(cdkObject),
        EnvironmentConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-awsaccount)
       */
      override fun awsAccount(): Any? = unwrap(this).getAwsAccount()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-awsregion)
       */
      override fun awsRegion(): Any = unwrap(this).getAwsRegion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-configurationparameters)
       */
      override fun configurationParameters(): Any? = unwrap(this).getConfigurationParameters()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-deploymentmode)
       */
      override fun deploymentMode(): String? = unwrap(this).getDeploymentMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-deploymentorder)
       */
      override fun deploymentOrder(): Number? = unwrap(this).getDeploymentOrder()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-environmentblueprintid)
       */
      override fun environmentBlueprintId(): String = unwrap(this).getEnvironmentBlueprintId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-environmentconfiguration.html#cfn-datazone-projectprofile-environmentconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty):
          EnvironmentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectProfile.EnvironmentConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RegionProperty regionProperty = RegionProperty.builder()
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-region.html)
   */
  public interface RegionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-region.html#cfn-datazone-projectprofile-region-regionname)
     */
    public fun regionName(): String

    /**
     * A builder for [RegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regionName the value to be set. 
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty.builder()

      /**
       * @param regionName the value to be set. 
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty,
    ) : CdkObject(cdkObject),
        RegionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectprofile-region.html#cfn-datazone-projectprofile-region-regionname)
       */
      override fun regionName(): String = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty):
          RegionProperty = CdkObjectWrappers.wrap(cdkObject) as? RegionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionProperty):
          software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectProfile.RegionProperty
    }
  }
}
