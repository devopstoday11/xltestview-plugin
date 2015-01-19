/**
 * Copyright (c) 2014-2015, XebiaLabs B.V., All rights reserved.
 *
 * The XL Test plugin for Jenkins is licensed under the terms of the GPLv2
 * <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most XebiaLabs
 * Libraries. There are special exceptions to the terms and conditions of the
 * GPLv2 as it is applied to this software, see the FLOSS License Exception
 * <https://github.com/jenkinsci/xltest-plugin/blob/master/LICENSE>.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.xebialabs.xltest.ci;

import hudson.model.FreeStyleProject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.recipes.LocalData;

@Ignore
public class XLTestNotifierFormTest {

    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Before
    public void setUp() {
    }



    @Test
    @LocalData
    public void testXLReleaseForm() throws Exception {
//        FreeStyleProject p = j.createFreeStyleProject();
//        XLTestNotifier before = new XLTestNotifier("admin", "atemplate", "1.0", null, false);
//        p.getPublishersList().add(before);
//
//        j.submit(j.createWebClient().getPage(p,"configure").getFormByName("config"));
//
//        XLTestNotifier after = p.getPublishersList().get(XLTestNotifier.class);
//
//        j.assertEqualBeans(before,after,"credential,suiteNames,version");
    }

}
