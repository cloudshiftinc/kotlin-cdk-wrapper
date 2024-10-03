@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserHierarchyStructure`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnUserHierarchyStructureProps cfnUserHierarchyStructureProps =
 * CfnUserHierarchyStructureProps.builder()
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .userHierarchyStructure(UserHierarchyStructureProperty.builder()
 * .levelFive(LevelFiveProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelFour(LevelFourProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelOne(LevelOneProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelThree(LevelThreeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelTwo(LevelTwoProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html)
 */
public interface CfnUserHierarchyStructureProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-instancearn)
   */
  public fun instanceArn(): String

  /**
   * Contains information about a hierarchy structure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
   */
  public fun userHierarchyStructure(): Any? = unwrap(this).getUserHierarchyStructure()

  /**
   * A builder for [CfnUserHierarchyStructureProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    public fun userHierarchyStructure(userHierarchyStructure: IResolvable)

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    public
        fun userHierarchyStructure(userHierarchyStructure: CfnUserHierarchyStructure.UserHierarchyStructureProperty)

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fabeaac781800f39a6c23779e69d54b61871d1bea40f2c6fb2223bbfefcf5584")
    public
        fun userHierarchyStructure(userHierarchyStructure: CfnUserHierarchyStructure.UserHierarchyStructureProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps.Builder =
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps.builder()

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    override fun userHierarchyStructure(userHierarchyStructure: IResolvable) {
      cdkBuilder.userHierarchyStructure(userHierarchyStructure.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    override
        fun userHierarchyStructure(userHierarchyStructure: CfnUserHierarchyStructure.UserHierarchyStructureProperty) {
      cdkBuilder.userHierarchyStructure(userHierarchyStructure.let(CfnUserHierarchyStructure.UserHierarchyStructureProperty.Companion::unwrap))
    }

    /**
     * @param userHierarchyStructure Contains information about a hierarchy structure.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fabeaac781800f39a6c23779e69d54b61871d1bea40f2c6fb2223bbfefcf5584")
    override
        fun userHierarchyStructure(userHierarchyStructure: CfnUserHierarchyStructure.UserHierarchyStructureProperty.Builder.() -> Unit):
        Unit =
        userHierarchyStructure(CfnUserHierarchyStructure.UserHierarchyStructureProperty(userHierarchyStructure))

    public fun build(): software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps,
  ) : CdkObject(cdkObject),
      CfnUserHierarchyStructureProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     */
    override fun userHierarchyStructure(): Any? = unwrap(this).getUserHierarchyStructure()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserHierarchyStructureProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps):
        CfnUserHierarchyStructureProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserHierarchyStructureProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserHierarchyStructureProps):
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructureProps
  }
}
