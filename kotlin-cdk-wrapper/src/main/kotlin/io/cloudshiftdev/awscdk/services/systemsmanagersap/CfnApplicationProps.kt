@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.systemsmanagersap

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.systemsmanagersap.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationId("applicationId")
 * .applicationType("applicationType")
 * // the properties below are optional
 * .componentsInfo(List.of(ComponentInfoProperty.builder()
 * .componentType("componentType")
 * .ec2InstanceId("ec2InstanceId")
 * .sid("sid")
 * .build()))
 * .credentials(List.of(CredentialProperty.builder()
 * .credentialType("credentialType")
 * .databaseName("databaseName")
 * .secretId("secretId")
 * .build()))
 * .databaseArn("databaseArn")
 * .instances(List.of("instances"))
 * .sapInstanceNumber("sapInstanceNumber")
 * .sid("sid")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html)
 */
public interface CfnApplicationProps {
  /**
   * The ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationid)
   */
  public fun applicationId(): String

  /**
   * The type of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationtype)
   */
  public fun applicationType(): String

  /**
   * This is an optional parameter for component details to which the SAP ABAP application is
   * attached, such as Web Dispatcher.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
   */
  public fun componentsInfo(): Any? = unwrap(this).getComponentsInfo()

  /**
   * The credentials of the SAP application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
   */
  public fun credentials(): Any? = unwrap(this).getCredentials()

  /**
   * The Amazon Resource Name (ARN) of the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-databasearn)
   */
  public fun databaseArn(): String? = unwrap(this).getDatabaseArn()

  /**
   * The Amazon EC2 instances on which your SAP application is running.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
   */
  public fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  /**
   * The SAP instance number of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sapinstancenumber)
   */
  public fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

  /**
   * The System ID of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sid)
   */
  public fun sid(): String? = unwrap(this).getSid()

  /**
   * The tags on the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The ID of the application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param applicationType The type of the application. 
     */
    public fun applicationType(applicationType: String)

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    public fun componentsInfo(componentsInfo: IResolvable)

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    public fun componentsInfo(componentsInfo: List<Any>)

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    public fun componentsInfo(vararg componentsInfo: Any)

    /**
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(credentials: IResolvable)

    /**
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(credentials: List<Any>)

    /**
     * @param credentials The credentials of the SAP application.
     */
    public fun credentials(vararg credentials: Any)

    /**
     * @param databaseArn The Amazon Resource Name (ARN) of the database.
     */
    public fun databaseArn(databaseArn: String)

    /**
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    public fun instances(instances: List<String>)

    /**
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    public fun instances(vararg instances: String)

    /**
     * @param sapInstanceNumber The SAP instance number of the application.
     */
    public fun sapInstanceNumber(sapInstanceNumber: String)

    /**
     * @param sid The System ID of the application.
     */
    public fun sid(sid: String)

    /**
     * @param tags The tags on the application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags on the application.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps.builder()

    /**
     * @param applicationId The ID of the application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param applicationType The type of the application. 
     */
    override fun applicationType(applicationType: String) {
      cdkBuilder.applicationType(applicationType)
    }

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    override fun componentsInfo(componentsInfo: IResolvable) {
      cdkBuilder.componentsInfo(componentsInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    override fun componentsInfo(componentsInfo: List<Any>) {
      cdkBuilder.componentsInfo(componentsInfo.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher.
     */
    override fun componentsInfo(vararg componentsInfo: Any): Unit =
        componentsInfo(componentsInfo.toList())

    /**
     * @param credentials The credentials of the SAP application.
     */
    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param credentials The credentials of the SAP application.
     */
    override fun credentials(credentials: List<Any>) {
      cdkBuilder.credentials(credentials.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param credentials The credentials of the SAP application.
     */
    override fun credentials(vararg credentials: Any): Unit = credentials(credentials.toList())

    /**
     * @param databaseArn The Amazon Resource Name (ARN) of the database.
     */
    override fun databaseArn(databaseArn: String) {
      cdkBuilder.databaseArn(databaseArn)
    }

    /**
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    /**
     * @param instances The Amazon EC2 instances on which your SAP application is running.
     */
    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    /**
     * @param sapInstanceNumber The SAP instance number of the application.
     */
    override fun sapInstanceNumber(sapInstanceNumber: String) {
      cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    /**
     * @param sid The System ID of the application.
     */
    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    /**
     * @param tags The tags on the application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags on the application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * The ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The type of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationtype)
     */
    override fun applicationType(): String = unwrap(this).getApplicationType()

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     */
    override fun componentsInfo(): Any? = unwrap(this).getComponentsInfo()

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     */
    override fun credentials(): Any? = unwrap(this).getCredentials()

    /**
     * The Amazon Resource Name (ARN) of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-databasearn)
     */
    override fun databaseArn(): String? = unwrap(this).getDatabaseArn()

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     */
    override fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

    /**
     * The SAP instance number of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sapinstancenumber)
     */
    override fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

    /**
     * The System ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sid)
     */
    override fun sid(): String? = unwrap(this).getSid()

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
  }
}
