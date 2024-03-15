@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStackSetProps {
  public fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

  public fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

  public fun callAs(): String? = unwrap(this).getCallAs()

  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  public fun managedExecution(): Any? = unwrap(this).getManagedExecution()

  public fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun permissionModel(): String

  public fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

  public fun stackSetName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  public fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  @CdkDslMarker
  public interface Builder {
    public fun administrationRoleArn(administrationRoleArn: String)

    public fun autoDeployment(autoDeployment: IResolvable)

    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94884309d1b95db1bcfea54028062296757ebac54e91c6a69cc0fd1950c04158")
    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit)

    public fun callAs(callAs: String)

    public fun capabilities(capabilities: List<String>)

    public fun capabilities(vararg capabilities: String)

    public fun description(description: String)

    public fun executionRoleName(executionRoleName: String)

    public fun managedExecution(managedExecution: Any)

    public fun operationPreferences(operationPreferences: IResolvable)

    public fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50c6449649f81761af9c959da02e5f49ff8548a4841ad994b5353b1858093d07")
    public
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty.Builder.() -> Unit)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun permissionModel(permissionModel: String)

    public fun stackInstancesGroup(stackInstancesGroup: IResolvable)

    public fun stackInstancesGroup(stackInstancesGroup: List<Any>)

    public fun stackInstancesGroup(vararg stackInstancesGroup: Any)

    public fun stackSetName(stackSetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateBody(templateBody: String)

    public fun templateUrl(templateUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnStackSetProps.Builder
        = software.amazon.awscdk.services.cloudformation.CfnStackSetProps.builder()

    override fun administrationRoleArn(administrationRoleArn: String) {
      cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    override fun autoDeployment(autoDeployment: IResolvable) {
      cdkBuilder.autoDeployment(autoDeployment.let(IResolvable::unwrap))
    }

    override fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty) {
      cdkBuilder.autoDeployment(autoDeployment.let(CfnStackSet.AutoDeploymentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94884309d1b95db1bcfea54028062296757ebac54e91c6a69cc0fd1950c04158")
    override
        fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit):
        Unit = autoDeployment(CfnStackSet.AutoDeploymentProperty(autoDeployment))

    override fun callAs(callAs: String) {
      cdkBuilder.callAs(callAs)
    }

    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    override fun managedExecution(managedExecution: Any) {
      cdkBuilder.managedExecution(managedExecution)
    }

    override fun operationPreferences(operationPreferences: IResolvable) {
      cdkBuilder.operationPreferences(operationPreferences.let(IResolvable::unwrap))
    }

    override
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty) {
      cdkBuilder.operationPreferences(operationPreferences.let(CfnStackSet.OperationPreferencesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50c6449649f81761af9c959da02e5f49ff8548a4841ad994b5353b1858093d07")
    override
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty.Builder.() -> Unit):
        Unit = operationPreferences(CfnStackSet.OperationPreferencesProperty(operationPreferences))

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    override fun permissionModel(permissionModel: String) {
      cdkBuilder.permissionModel(permissionModel)
    }

    override fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.let(IResolvable::unwrap))
    }

    override fun stackInstancesGroup(stackInstancesGroup: List<Any>) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup)
    }

    override fun stackInstancesGroup(vararg stackInstancesGroup: Any): Unit =
        stackInstancesGroup(stackInstancesGroup.toList())

    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnStackSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSetProps,
  ) : CdkObject(cdkObject), CfnStackSetProps {
    override fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

    override fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

    override fun callAs(): String? = unwrap(this).getCallAs()

    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

    override fun managedExecution(): Any? = unwrap(this).getManagedExecution()

    override fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun permissionModel(): String = unwrap(this).getPermissionModel()

    override fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

    override fun stackSetName(): String = unwrap(this).getStackSetName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    override fun templateUrl(): String? = unwrap(this).getTemplateUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSetProps):
        CfnStackSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackSetProps):
        software.amazon.awscdk.services.cloudformation.CfnStackSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnStackSetProps
  }
}
