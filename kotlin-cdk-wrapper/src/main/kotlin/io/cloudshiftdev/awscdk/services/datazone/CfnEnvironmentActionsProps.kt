@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEnvironmentActions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnEnvironmentActionsProps cfnEnvironmentActionsProps = CfnEnvironmentActionsProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .identifier("identifier")
 * .parameters(AwsConsoleLinkParametersProperty.builder()
 * .uri("uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html)
 */
public interface CfnEnvironmentActionsProps {
  /**
   * The description of the Amazon DataZone environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon DataZone domain ID of the environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-domainidentifier)
   */
  public fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

  /**
   * The environment ID of the environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-environmentidentifier)
   */
  public fun environmentIdentifier(): String? = unwrap(this).getEnvironmentIdentifier()

  /**
   * The ID of the environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-identifier)
   */
  public fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * The name of the environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-name)
   */
  public fun name(): String

  /**
   * The parameters of the console link specified as part of the environment action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A builder for [CfnEnvironmentActionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Amazon DataZone environment action.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The Amazon DataZone domain ID of the environment action.
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param environmentIdentifier The environment ID of the environment action.
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param identifier The ID of the environment action.
     */
    public fun identifier(identifier: String)

    /**
     * @param name The name of the environment action. 
     */
    public fun name(name: String)

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    public fun parameters(parameters: CfnEnvironmentActions.AwsConsoleLinkParametersProperty)

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06e5e6d7c978e3cc4891b551f5d1024828f275b8604828aaf41f605e844c13fb")
    public
        fun parameters(parameters: CfnEnvironmentActions.AwsConsoleLinkParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps.builder()

    /**
     * @param description The description of the Amazon DataZone environment action.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The Amazon DataZone domain ID of the environment action.
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentIdentifier The environment ID of the environment action.
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param identifier The ID of the environment action.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param name The name of the environment action. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    override fun parameters(parameters: CfnEnvironmentActions.AwsConsoleLinkParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnEnvironmentActions.AwsConsoleLinkParametersProperty.Companion::unwrap))
    }

    /**
     * @param parameters The parameters of the console link specified as part of the environment
     * action.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06e5e6d7c978e3cc4891b551f5d1024828f275b8604828aaf41f605e844c13fb")
    override
        fun parameters(parameters: CfnEnvironmentActions.AwsConsoleLinkParametersProperty.Builder.() -> Unit):
        Unit = parameters(CfnEnvironmentActions.AwsConsoleLinkParametersProperty(parameters))

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps,
  ) : CdkObject(cdkObject),
      CfnEnvironmentActionsProps {
    /**
     * The description of the Amazon DataZone environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon DataZone domain ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-domainidentifier)
     */
    override fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

    /**
     * The environment ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-environmentidentifier)
     */
    override fun environmentIdentifier(): String? = unwrap(this).getEnvironmentIdentifier()

    /**
     * The ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-identifier)
     */
    override fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     * The name of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parameters of the console link specified as part of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentActionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps):
        CfnEnvironmentActionsProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEnvironmentActionsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentActionsProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps
  }
}
