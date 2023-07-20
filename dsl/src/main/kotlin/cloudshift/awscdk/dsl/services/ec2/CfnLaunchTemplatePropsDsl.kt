@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchTemplatePropsDsl {
    private val cdkBuilder: CfnLaunchTemplateProps.Builder = CfnLaunchTemplateProps.builder()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    public fun launchTemplateData(launchTemplateData: IResolvable) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    public fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnLaunchTemplateProps {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
