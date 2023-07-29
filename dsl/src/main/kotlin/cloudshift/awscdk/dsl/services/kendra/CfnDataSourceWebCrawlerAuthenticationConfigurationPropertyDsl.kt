@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to websites that require user authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * WebCrawlerAuthenticationConfigurationProperty webCrawlerAuthenticationConfigurationProperty =
 * WebCrawlerAuthenticationConfigurationProperty.builder()
 * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
 * .credentials("credentials")
 * .host("host")
 * .port(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerauthenticationconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.builder()

    private val _basicAuthentication: MutableList<Any> = mutableListOf()

    /**
     * @param basicAuthentication The list of configuration information that's required to connect
     *   to and crawl a website host using basic authentication credentials. The list includes the
     *   name and port number of the website host.
     */
    public fun basicAuthentication(vararg basicAuthentication: Any) {
        _basicAuthentication.addAll(listOf(*basicAuthentication))
    }

    /**
     * @param basicAuthentication The list of configuration information that's required to connect
     *   to and crawl a website host using basic authentication credentials. The list includes the
     *   name and port number of the website host.
     */
    public fun basicAuthentication(basicAuthentication: Collection<Any>) {
        _basicAuthentication.addAll(basicAuthentication)
    }

    /**
     * @param basicAuthentication The list of configuration information that's required to connect
     *   to and crawl a website host using basic authentication credentials. The list includes the
     *   name and port number of the website host.
     */
    public fun basicAuthentication(basicAuthentication: IResolvable) {
        cdkBuilder.basicAuthentication(basicAuthentication)
    }

    public fun build(): CfnDataSource.WebCrawlerAuthenticationConfigurationProperty {
        if (_basicAuthentication.isNotEmpty()) cdkBuilder.basicAuthentication(_basicAuthentication)
        return cdkBuilder.build()
    }
}
