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
 * Properties for defining a `CfnProjectMembership`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectMembershipProps cfnProjectMembershipProps = CfnProjectMembershipProps.builder()
 * .designation("designation")
 * .domainIdentifier("domainIdentifier")
 * .member(MemberProperty.builder()
 * .groupIdentifier("groupIdentifier")
 * .userIdentifier("userIdentifier")
 * .build())
 * .projectIdentifier("projectIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html)
 */
public interface CfnProjectMembershipProps {
  /**
   * The designated role of a project member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-designation)
   */
  public fun designation(): String

  /**
   * The ID of the Amazon DataZone domain in which project membership is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The details about a project member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
   */
  public fun member(): Any

  /**
   * The ID of the project for which this project membership was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-projectidentifier)
   */
  public fun projectIdentifier(): String

  /**
   * A builder for [CfnProjectMembershipProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param designation The designated role of a project member. 
     */
    public fun designation(designation: String)

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain in which project membership is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param member The details about a project member. 
     */
    public fun member(member: IResolvable)

    /**
     * @param member The details about a project member. 
     */
    public fun member(member: CfnProjectMembership.MemberProperty)

    /**
     * @param member The details about a project member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76797a94a27a556a30815e8a983c2180a75194143dbc5ad1d409910b175617c8")
    public fun member(member: CfnProjectMembership.MemberProperty.Builder.() -> Unit)

    /**
     * @param projectIdentifier The ID of the project for which this project membership was created.
     * 
     */
    public fun projectIdentifier(projectIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnProjectMembershipProps.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectMembershipProps.builder()

    /**
     * @param designation The designated role of a project member. 
     */
    override fun designation(designation: String) {
      cdkBuilder.designation(designation)
    }

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain in which project membership is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param member The details about a project member. 
     */
    override fun member(member: IResolvable) {
      cdkBuilder.member(member.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param member The details about a project member. 
     */
    override fun member(member: CfnProjectMembership.MemberProperty) {
      cdkBuilder.member(member.let(CfnProjectMembership.MemberProperty.Companion::unwrap))
    }

    /**
     * @param member The details about a project member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76797a94a27a556a30815e8a983c2180a75194143dbc5ad1d409910b175617c8")
    override fun member(member: CfnProjectMembership.MemberProperty.Builder.() -> Unit): Unit =
        member(CfnProjectMembership.MemberProperty(member))

    /**
     * @param projectIdentifier The ID of the project for which this project membership was created.
     * 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectMembershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembershipProps,
  ) : CdkObject(cdkObject),
      CfnProjectMembershipProps {
    /**
     * The designated role of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-designation)
     */
    override fun designation(): String = unwrap(this).getDesignation()

    /**
     * The ID of the Amazon DataZone domain in which project membership is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     */
    override fun member(): Any = unwrap(this).getMember()

    /**
     * The ID of the project for which this project membership was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-projectidentifier)
     */
    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectMembershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembershipProps):
        CfnProjectMembershipProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectMembershipProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectMembershipProps):
        software.amazon.awscdk.services.datazone.CfnProjectMembershipProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnProjectMembershipProps
  }
}
